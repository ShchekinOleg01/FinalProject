package dao.daoImpl;
import dao.BookingDao;
import entity.Booking;
import entity.CADFrame;
import entity.Flight;
import entity.FligthtList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;



public class BookingDaoImpl implements BookingDao {


  FligthtList fligthtList = new FligthtList();
  Map<Integer, Flight> getflyList = fligthtList.getFlightList();


  @Override
  public void bookingFlight(int id, String location, String date, int tickets) {
    Booking ticket = new Booking(id, location, date, tickets);


    for (Map.Entry<Integer, Flight> entry : getflyList.entrySet()) {
      Integer key = entry.getKey();
      Flight value = entry.getValue();
      if (Objects.equals(value.getDestination().trim(), ticket.getLocate()) &&
              Objects.equals(value.getDate().trim(), ticket.getDate()) &&
              ticket.getTickets() <= value.getFreeSeat()) {
        Flight flight = new Flight(0);
        int lostSeat = value.getFreeSeat() - ticket.getTickets();
        System.out.println("lostSeat - " + lostSeat);
        flight.setFreeSeat(lostSeat);
        CADFrame cadFrame = new CADFrame();
        System.out.println("Оставшийся рейс - " + value);
        cadFrame.getOne(key);
        value.setFreeSeat(lostSeat);
        System.out.println("Свободные места - " + value.getFreeSeat());
        System.out.println("Рейс - " + value);
        List<Flight> allFlight = fligthtList.getAllFlight();
        fligthtList.setAllFlight(allFlight);

        fligthtList.cadList();

      }

    }
  }

  @Override
  public void writeFile() throws FileNotFoundException {
    List<Flight> list = fligthtList.getAllFlight();
    FileOutputStream fos = new FileOutputStream("Booking.txt");
    try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      for (Flight flight : list) {
        oos.writeObject(flight);
      }
    } catch (IOException e) {
      System.out.println("ERROR - " + e);
    }
    System.out.println("Запись в файл - Booking.txt, прошла успешно!!!");
  }
  }





//    public void loadData() {
//      FileInputStream fis = new FileInputStream("Femaly.txt");
//      ObjectInputStream oin = new ObjectInputStream(fis);
//      List<Flight> list = fligthtList.getAllFlight();
//
//      while (true) {
//        try {
//          list.add((Flight) oin.readObject());
//        } catch (EOFException e) {
//          System.out.println("Нет данных");
//          break;
//        } catch (StreamCorruptedException | ClassNotFoundException e) {
//          e.printStackTrace();
//          System.out.println("Нет данных");
//        }
//      }
//      System.out.println("Считывание данных прошло успешно!!!");
//      System.out.println(fligthtList);
//      fis.close();
//    }
//  }

//Zaporizhzhia 15/02/2022




