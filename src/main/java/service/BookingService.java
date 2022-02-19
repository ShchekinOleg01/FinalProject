package service;

import dao.BookingDao;
import dao.daoImpl.BookingDaoImpl;
import entity.Booking;

import java.util.List;

public class BookingService {
  private BookingDao bookingDao;
  public BookingService(BookingDao bookingDao) {
    this.bookingDao = bookingDao;
  }
  public void bookingFlight(int id, String location, String date, int tickets) {
    System.out.println("BookingService RUN");
    bookingDao.hello();

  }

  public List<Booking> getAllBookings() {
    return bookingDao.getAllBookings();
  }
  public void addBooking(int idFlight, String name, String surname){
    bookingDao.addBooking(idFlight, name, surname);
  }
  public void deleteBooking(int i){
    bookingDao.deleteBooking(i);
  }
  public List<Booking> getBookingByUser(List<Booking> bookings, String name, String surname){
    return bookingDao.getBookingsByUser(bookings, name, surname);
  }
}