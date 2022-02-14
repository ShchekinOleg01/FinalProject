package dao;

import entity.Booking;

import java.util.List;

public interface BookingDao extends DAO<Booking> {
  List<Booking> getAllBookings();

  Booking getBookingByIndex(int i);

  void deleteBooking(Booking family);

  void deleteBooking(int i);

  void saveBooking(Booking family);
}
