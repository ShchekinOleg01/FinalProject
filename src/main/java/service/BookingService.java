package service;

import dao.BookingDao;
import entity.Booking;

import java.util.List;

public class BookingService {
  BookingDao bookingDao;

  public BookingService(BookingDao bookingDao) {
    this.bookingDao = bookingDao;
  }
  public List<Booking> getAllBookings(){return bookingDao.getAllBookings();}
}
