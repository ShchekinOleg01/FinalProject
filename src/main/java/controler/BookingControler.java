package controler;

import entity.Booking;
import service.BookingService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class BookingControler {
  BookingService bookingService;

  public BookingControler(BookingService bookingService) {
    this.bookingService = bookingService;
  }

  public void bookingFlight(int id, String location, String date, int tickets){
    bookingService.bookingFlight(id, location, date, tickets);
  }
  public void writeFile() throws FileNotFoundException {
    bookingService.writeFile();
  }
  public void loadData() throws IOException {
    bookingService.loadData();
  }
}