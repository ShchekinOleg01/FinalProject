package controler;

import entity.Booking;
import service.BookingService;

import java.util.List;

public class BookingControler {
  BookingService bookingService;

  public BookingControler(BookingService bookingService) {
    this.bookingService = bookingService;
  }

  public List<Booking> getAllBooking(){return bookingService.getAllBookings();}
}
