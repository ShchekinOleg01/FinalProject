package entity;

import java.util.Objects;

public class Flight extends AbstractEntity {

  private String distinationTo;
  private long departureTime;
  private int numberFreeSeats;

  public Flight(long id) {
    super(id);
  }

  public Flight(long id, String distinationTo, long departureTime, int numberFreeSeats) {
    super(id);
    this.distinationTo = distinationTo;
    this.departureTime = departureTime;
    this.numberFreeSeats = numberFreeSeats;
  }

  public String getDistinationTo() {
    return distinationTo;
  }

  public void setDistinationTo(String distinationTo) {
    this.distinationTo = distinationTo;
  }

  public long getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(long departureTime) {
    this.departureTime = departureTime;
  }

  public int getNumberFreeSeats() {
    return numberFreeSeats;
  }

  public void setNumberFreeSeats(int numberFreeSeats) {
    this.numberFreeSeats = numberFreeSeats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Flight)) return false;
    Flight flight = (Flight) o;
    return getDepartureTime() == flight.getDepartureTime() &&
      getNumberFreeSeats() == flight.getNumberFreeSeats() &&
      Objects.equals(getDistinationTo(), flight.getDistinationTo());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getDistinationTo(), getDepartureTime(), getNumberFreeSeats());
  }

  @Override
  public String toString() {
    return "Flight{" +
      "distinationTo='" + distinationTo + '\'' +
      ", departureTime=" + departureTime +
      ", numberFreeSeats=" + numberFreeSeats +
      ", id=" + id +
      '}';
  }
}
