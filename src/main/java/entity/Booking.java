package entity;

import java.util.Objects;

public class Booking extends AbstractEntity {
private String locate;
private String date;
private int tickets;
public static int countBooking = 0;


  public Booking(long id, String locate, String date, int tickets) {
    super(id);
    countBooking++;
    this.locate = locate;
    this.date = date;
    this.tickets = tickets;
  }

  public String getLocate() {
    return locate;
  }

  public void setLocate(String locate) {
    this.locate = locate;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getTickets() {
    return tickets;
  }

  public void setTickets(int tickets) {
    this.tickets = tickets;
  }

  @Override
  public String toString() {
    return "Booking{" +
            "locate='" + locate + '\'' +
            ", date='" + date + '\'' +
            ", tickets=" + tickets +
            '}';
  }
}