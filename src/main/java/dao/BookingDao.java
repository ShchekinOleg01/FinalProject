package dao;

import entity.Booking;

import java.util.ArrayList;
import java.util.List;

public interface BookingDao {

  List<Booking>  getAllBookings();
  List<Booking> booking = new ArrayList<>();

  List<Booking> getBookingsByUser(List<Booking> bookings, String name, String surname);

 // void bookingFlight(int id, String location, String date, int tickets);

  Booking getBookingByIndex(int i);

  void deleteBooking(Booking booking);

  void deleteBooking(int i);

  void saveBooking(Booking booking);

  void addBooking(int i, String a, String b);

  void bookingFlight(int id, String location, String date, int tickets);
  void hello();
}