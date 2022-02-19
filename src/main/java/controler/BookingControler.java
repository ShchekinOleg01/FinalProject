package controler;

import entity.Booking;
import service.BookingService;

import java.util.List;

public class BookingControler {
  BookingService bookingService;

  public BookingControler(BookingService bookingService) {
    this.bookingService = bookingService;
  }
  public void bookingFlight(int id, String Location, String Date, int Tickets) {
    bookingService.bookingFlight(id, Location, Date, Tickets);
  }

  public List<Booking> getAllBookings() {
    return bookingService.getAllBookings();
  }
  public void addBooking(int idFlight, String name, String surname){
    bookingService.addBooking(idFlight, name, surname);
  }
  public void deleteBooking(int i){
    bookingService.deleteBooking(i);
  }
  public List<Booking> getBookingByUser(List<Booking> bookings, String name, String surname){
    return bookingService.getBookingByUser(bookings, name, surname);
  }
}