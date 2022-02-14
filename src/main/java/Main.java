import controler.BookingControler;
import controler.FlightControler;
import dao.BookingDao;
import dao.DaoFactory;
import dao.FlightDao;
import dao.daoImpl.DaoFactoryImpl;
import service.BookingService;
import service.FlightServise;

public class Main {
  public static void main(String[] args) {
    FlightDao flightDAO = DaoFactoryImpl.createFlightDao();
    FlightServise flightServise = new FlightServise(flightDAO);
    FlightControler flightControler = new FlightControler(flightServise);

    flightControler.getAllFlights();

    BookingDao bookingDao = DaoFactory.createBookingDao();
    BookingService bookingService = new BookingService(bookingDao);
    BookingControler bookingControler = new BookingControler(bookingService);
  }
}

