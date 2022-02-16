package dao;

import entity.Booking;

import java.util.List;

public interface BookingDao extends DAO<Booking> {
  List<Booking> getAllBookings();

  List<Booking> getBookingsByUser(List<Booking> bookings, String name, String surname);

  Booking getBookingByIndex(int i);

  void deleteBooking(Booking booking);

  void deleteBooking(int i);

  void saveBooking(Booking booking);

  void addBooking(int i, String a, String b);


}
