package service;

import dao.FlightDao;
import entity.Flight;

import java.io.IOException;
import java.util.List;

public class FlightServise {
  FlightDao flightDao;
  public FlightServise(FlightDao flightDao) {
    this.flightDao = flightDao;
  }
  public void loadData() throws IOException {
    flightDao.loadData();
  }
  public void writeFile() throws IOException {
    flightDao.writeFile();
  }
  public List<Flight> getAllFlights() {return flightDao.getAllFlights();};
  public void getScoreboardFlight() throws IOException {
    flightDao.getScoreboardFlight();
  }
  public void getScoreboard (){flightDao.getScoreboard();};
  public  void getFlightByID(int IDFlight) {
     flightDao.getFlightByID(IDFlight);
  }

}
