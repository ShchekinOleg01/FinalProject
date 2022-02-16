import controler.BookingControler;
import controler.FlightControler;
import dao.BookingDao;
import dao.DaoFactory;
import dao.FlightDao;
import dao.daoImpl.DaoFactoryImpl;
import entity.Booking;
import service.BookingService;
import service.FlightServise;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello");
    FlightDao flightDAO = DaoFactoryImpl.createFlightDao();
    FlightServise flightServise = new FlightServise(flightDAO);
    FlightControler flightControler = new FlightControler(flightServise);

    flightControler.getAllFlights();

    BookingDao bookingDao = DaoFactory.createBookingDao();
    BookingService bookingService = new BookingService(bookingDao);
    BookingControler bookingControler = new BookingControler(bookingService);

    Booking booking1 = new Booking(1, 1, "Tom", "Li");
    Booking booking2 = new Booking(2, 1, "T", "Li");
    Booking booking3 = new Booking(3, 1, "Tom", "L");

    List<Booking> bookings = new ArrayList<>();
    bookings.add(booking1);
    bookings.add(booking2);
    bookings.add(booking3);

    System.out.println(bookingControler.getBookingByUser(bookings, "Tom", "Li"));

    bookingControler.addBooking(1, "Jack", "Black");

    System.out.println(bookingControler.getAllBookings());


  }
}
