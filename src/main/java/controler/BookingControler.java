package controler;
import service.BookingService;

import java.io.FileNotFoundException;
import java.io.IOException;


public class BookingControler {

  BookingService bookingService;
  public BookingControler(BookingService bookingService) {
    this.bookingService = bookingService;
  }
  public void bookingFlight(int id, String location, String date, int tickets){
    bookingService.bookingFlight(id, location, date, tickets);}
  public void canceled(){
    bookingService.canceled();
  };
  public void showFlight(){
 bookingService.showFlight();
  }
}