package dao.daoImpl;

import dao.BookingDao;
import entity.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BookingDaoImpl implements BookingDao {
  private List<Booking> bookings = new ArrayList<>();

  @Override
  public List<Booking> getAllBookings() {
    return bookings;
  }

  @Override
  public List<Booking> getBookingsByUser(List<Booking> book, String name, String surname) {
    List<Booking> bookingByUser = new ArrayList<>();
    return bookingByUser = book.stream()
      .filter(s -> s.getUserName() == name)
      .filter(s -> s.getUserSurname().equals(surname))
      .collect(Collectors.toList());
  }

  @Override
  public Booking getBookingByIndex(int i) {
    return bookings.get(i);
  }

  @Override
  public void deleteBooking(Booking booking) {
    bookings.remove(booking);
  }

  @Override
  public void deleteBooking(int i) {
    bookings.remove(i);
  }

  @Override
  public void saveBooking(Booking booking) {
    bookings.add(booking);
  }

  public void addBooking(int idFlight, String userName, String userSurname) {
    Random random = new Random();
    Booking booking = new Booking(random.nextInt(99), idFlight, userName, userSurname);
    bookings.add(booking);
  }

  @Override
  public void create(Booking object) {

  }

  @Override
  public Booking getById(int id) {
    return bookings.get(id);
  }

  @Override
  public List<Booking> getAll() {
    return bookings;
  }

  @Override
  public void update(Booking object) {

  }

  @Override
  public void delete(Booking object) {

  }

  @Override
  public void close() {

  }
}
