package service;

import dao.BookingDao;
import dao.daoImpl.BookingDaoImpl;
import entity.*;

import java.util.*;
import java.util.stream.Stream;

public class BookingService {
  FligthtList fligthtList = new FligthtList();
  Map<Integer, Flight> getflyList = fligthtList.getFlightList();
  CADFrame cadFrame = new CADFrame();
  private final BookingDao bookingDao;
  List <BookingPay> der = new ArrayList<>();
  RenderReservedFlight renderReservedFlight = new RenderReservedFlight(der);

  public BookingService(BookingDaoImpl bookingDao) {
    this.bookingDao = bookingDao;
  }
  public void bookingFlight(int id, String location, String date, int tickets){
    Booking ticket = new Booking(id, location, date, tickets);
    Stream<Flight> flightStream = getflyList.values()
            .stream()
            .filter(locate -> locate.getDestination().trim()
                    .equals(ticket.getLocate().trim()) && locate.getDate().trim()
                    .equals(ticket.getDate().trim()) &&
                    ticket.getTickets() <= locate.getFreeSeat());
    List <Flight> listFlight = flightStream.toList();
    cadFrame.getSearchFlight(listFlight);
    Scanner in = new Scanner(System.in);
    try {
      System.out.println("Введите пожалуйста номер рейса для бронирования или выбкрите  - 0, для выхода в главное меню");
      String idFlight = in.nextLine();
      int num5 = Integer.parseInt(idFlight);
      if (num5==0)return;
      cadFrame.getOne(num5);
      System.out.println("Введите имя для бронирования");
      String name = in.nextLine().toLowerCase(Locale.ROOT);
      System.out.println("Введите фамилию для бронирования");
      String sureName = in.nextLine().toLowerCase(Locale.ROOT);
      List<Flight> getF = fligthtList.getAllFlight();
      Flight getFlight = getF.stream()
              .filter(a -> num5 == a.getId())
              .findFirst()
              .orElse(null);
      assert getFlight != null;
      getFlight.setFreeSeat(tickets);
      long r= getFlight.getId();
      BookingPay bookingPay = new BookingPay(r, name, sureName, tickets, getFlight);
        System.out.println("РЕЕЕЕЙС - " + bookingPay);
      der.add(bookingPay);
      renderReservedFlight.setBookingPays(der); //Рендер корректировка
      renderReservedFlight.render();              //Рендер корректировка
    } catch (NumberFormatException e) {
    System.err.println("\n" + "Wrong string format!");
    System.out.println(" please, try again only numbers."); }
    catch (Exception e){
      System.out.println("Error : " + e );
    }
  }

  public void canceled(){
      if (der.size() >=1) {
          renderReservedFlight.render();
          System.out.println("Для отмены бронирования введите пожалуйчта № рейса");
          Scanner in = new Scanner(System.in);
          String cancel = in.nextLine();
          int index = Integer.parseInt(cancel);
          try {
              der.forEach(i-> {
                  if((i.getFlight().getId() == index)) {
                      der.remove(i);
                      System.out.println("Удаление выполненно успешно!!!");
                  }
              });
          } catch (Exception ignored) {
          }
      } else {
          System.out.println("Нет забронированных рейсов");
      }
  };

  public void showFlight(){
      if (der.size() >=1) {
          System.out.println("Для поиска забранированных рейсов введите Фамилию и Имя");
          System.out.println("Введите Имя");
          Scanner in = new Scanner(System.in);
          String name = in.nextLine().toLowerCase(Locale.ROOT);
          System.out.println("Введите Фамилия");
          String sureName = in.nextLine().toLowerCase(Locale.ROOT);
           try {
              der.forEach(i-> {
                  if((Objects.equals(i.getSureName(), sureName) && Objects.equals(i.getName(), name))) {
                      System.out.println("Совпадение произошло");
                      renderReservedFlight.render();
                  }else{
                      System.out.println("Нет совпадений поиска рейса по имени и фамилии");
                      System.out.println("Проверьте корректность введённых данных");
                  }
              });
          } catch (Exception ignored) {
          }
      } else {
          System.out.println("Нет забронированных рейсов");
      }
  };

}