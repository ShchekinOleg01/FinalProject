package dao.daoImpl;


import dao.BookingDao;
import dao.DaoFactory;
import dao.FlightDao;

public final class DaoFactoryImpl extends DaoFactory {
  public static FlightDao createFlightDao() {
    return new FlightDaoImpl() {
    };
  }
  public static BookingDao createBookingDao() {
    return new BookingDaoImpl() {
    };
  }
}
