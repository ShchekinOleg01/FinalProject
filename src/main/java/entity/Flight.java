package entity;

import java.util.Objects;

public class Flight extends AbstractEntity {
  long departureTime;
  String destination;
  int numberFreeSeats;

  public Flight(long id) {
    super(id);
  }

  public Flight(long id, long departureTime, String destination, int numberFreeSeats) {
    super(id);
    this.departureTime = departureTime;
    this.destination = destination;
    this.numberFreeSeats = numberFreeSeats;
  }

  public long getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(long departureTime) {
    this.departureTime = departureTime;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
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
      Objects.equals(getDestination(), flight.getDestination());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getDepartureTime(), getDestination(), getNumberFreeSeats());
  }

  @Override
  public String toString() {
    return "Flight{" +
      "departureTime=" + departureTime +
      ", destination='" + destination + '\'' +
      ", numberFreeSeats=" + numberFreeSeats +
      ", id=" + id +
      '}';
  }
}
