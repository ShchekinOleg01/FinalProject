package dao.daoImpl;

import dao.BookingDao;
import entity.*;

import java.util.ArrayList;
import java.util.List;

public class BookingDaoImpl implements BookingDao {
    public void hello(){
        System.out.println("Hello");
    }

  private List<Booking> bookings = getAllBookings();
 // FligthtList fligthtList = new FligthtList();


  public void bookingFlight(int id, String location, String date, int tickets) {
    System.out.println("BookingService - " );
    System.out.println("*********************************************");
//    System.out.println("fligthtList - " + fligthtList);
//
//    Booking ticket = new Booking(id,Location, Date,Tickets);
//
//    Map<Integer, Flight> getflyList = fligthtList.getFlightList();
//    for(Map.Entry<Integer, Flight> entry: getflyList.entrySet()) {
//      Integer key = entry.getKey();
//      Flight value = entry.getValue();
//      if (Objects.equals(value.getDestination().trim(), ticket.getLocate()) &&
//              Objects.equals(value.getDate().trim(), ticket.getDate()) &&
//              ticket.getTickets() <= value.getFreeSeat()) {
//
//        System.out.println("Локация совпадает - " + ticket);
//        System.out.println("resirve - " + ticket.getTickets());
//        System.out.println("Free Tikets - " + value.getFreeSeat());
//        Flight flight = new Flight(0);
//        int lostSeat = value.getFreeSeat() - ticket.getTickets();
//        System.out.println("lostSeat - " + lostSeat);
//        flight.setFreeSeat(lostSeat);
//        CADFrame cadFrame = new CADFrame();
//        System.out.println("Оставшийся рейс - " + value);
//        cadFrame.getOne(key);
//      }
//     }
  }

  @Override
  public List<Booking> getAllBookings() {
    return bookings;
  }

  @Override
  public List<Booking> getBookingsByUser(List<Booking> book, String name, String surname) {
//    List<Booking> bookingByUser = new ArrayList<>();
//    return bookingByUser = book.stream()
//            .filter(s -> s.getUserName() == name)
//            .filter(s -> s.getUserSurname().equals(surname))
//            .collect(Collectors.toList());
   // return book;
    return null;
  }



  @Override
  public Booking getBookingByIndex(int i) {
    return bookings.get(i);
  }

  @Override
  public void deleteBooking(Booking booking) {
    bookings.remove(booking);
  }

  @Override
  public void deleteBooking(int i) {
    bookings.remove(i);
  }

  @Override
  public void saveBooking(Booking booking) {
    bookings.add(booking);
  }

  public void addBooking(int idFlight, String userName, String userSurname) {
//    Random random = new Random();
//    Booking booking = new Booking(random.nextInt(99), idFlight, userName, userSurname);
//    bookings.add(booking);
  }

//  @Override
//  public void create(Booking object) {
//
//  }
//
//  @Override
//  public Booking getById(int id) {
//    return bookings.get(id);
//  }
//
//  @Override
//  public List<Booking> getAll() {
//    return bookings;
//  }
//
//  @Override
//  public void update(Booking object) {
//
//  }
//
//  @Override
//  public void delete(Booking object) {
//
//  }
//
//  @Override
//  public void close() {
//
//  }
}