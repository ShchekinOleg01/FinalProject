package service;

import dao.BookingDao;
import dao.daoImpl.BookingDaoImpl;
import entity.Booking;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class BookingService {

  private final BookingDao bookingDao;

  public BookingService(BookingDaoImpl bookingDao) {
    this.bookingDao = bookingDao;
  }

  public void bookingFlight(int id, String location, String date, int tickets){
    bookingDao.bookingFlight(id, location, date, tickets);
  }
  public void writeFile() throws FileNotFoundException {
    bookingDao.writeFile();
  }
  public void loadData() throws IOException {
    bookingDao.loadData();
  }
}