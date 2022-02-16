package dao;

import dao.daoImpl.BookingDaoImpl;
import dao.daoImpl.DaoFactoryImpl;
import dao.daoImpl.FlightDaoImpl;

public abstract class DaoFactory {
  private static DaoFactory daoFactory;

  public static FlightDao createFlightDao() {
    return new FlightDaoImpl();
  }
  public static BookingDao createBookingDao() {
    return new BookingDaoImpl();
  }

  public static DaoFactory getInstance(){
    if(daoFactory == null){
      synchronized (DaoFactory.class){
        if(daoFactory == null){
          daoFactory = new DaoFactoryImpl();
        }
      }
    }
    return daoFactory;
  }
}
