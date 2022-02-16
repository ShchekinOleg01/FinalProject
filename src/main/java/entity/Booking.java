package entity;

import java.util.Objects;

public class Booking extends AbstractEntity {
  int idFlight;
  String userName;
  String userSurname;

  public Booking(long id) {
    super(id);
  }

  public Booking(long id, int idFlight, String userName, String userSurname) {
    super(id);
    this.idFlight = idFlight;
    this.userName = userName;
    this.userSurname = userSurname;
  }

  public int getIdFlight() {
    return idFlight;
  }

  public void setIdFlight(int idFlight) {
    this.idFlight = idFlight;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserSurname() {
    return userSurname;
  }

  public void setUserSurname(String userSurname) {
    this.userSurname = userSurname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Booking)) return false;
    Booking booking = (Booking) o;
    return getIdFlight() == booking.getIdFlight() &&
      Objects.equals(getUserName(), booking.getUserName()) &&
      Objects.equals(getUserSurname(), booking.getUserSurname());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getIdFlight(), getUserName(), getUserSurname());
  }

  @Override
  public String toString() {
    return "Booking{" +
      "idFlight=" + idFlight +
      ", userName='" + userName + '\'' +
      ", userSurname='" + userSurname + '\'' +
      ", id=" + id +
      '}';
  }
}
