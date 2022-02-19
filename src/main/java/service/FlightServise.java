package service;

import dao.FlightDao;
import entity.Flight;

import java.util.List;

public class FlightServise {
  FlightDao flightDao;

  public FlightServise(FlightDao flightDao) {
    this.flightDao = flightDao;
  }

  public List<Flight> getAllFlights() {return flightDao.getAllFlights();};

  public void getScoreboardFlight(){
    flightDao.getScoreboardFlight();
  }
  public void getScoreboard (){
    flightDao.getScoreboard();
  };

  public Flight getFlightByID(int IDFlight) {
    return flightDao.getFlightByID(IDFlight);
  }




}
