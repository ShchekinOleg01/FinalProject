package dao.daoImpl;

import dao.FlightDao;
import entity.CADFrame;
import entity.Flight;
import entity.FligthtList;
import entity.Scoreboard;


import java.util.List;
import java.util.Map;

public class FlightDaoImpl implements FlightDao {
  FligthtList fligthtList = new FligthtList();
  Scoreboard scoreboard = new Scoreboard();
  CADFrame cadFrame = new CADFrame();
  List<Flight> flightList = fligthtList.getAllFlight();



  @Override
  public List<Flight> getAllFlights() {
    return flightList;
  }


  public void getScoreboardFlight() {
    fligthtList.cadList();
  }

  @Override
  public void getScoreboard() {
  scoreboard.cadTabloList();
  }

  @Override
  public Flight getFlightByID(int IDFlight) {
    if (IDFlight >= flightList.size()){
      System.out.println("Нет такого индекса семьи : " + IDFlight + ", " + "null");

    }
    cadFrame.getOne(IDFlight);

    return null;
  }

  @Override
  public void deleteFlight(Flight family) {

  }

  @Override
  public void deleteFlight(int i) {

  }

  @Override
  public void saveFlight(Flight family) {
  }

  @Override
  public void create(Flight object) {

  }

  @Override
  public Flight getById(int id) {
    return null;
  }

  @Override
  public List<Flight> getAll() {
    return null;
  }

  @Override
  public void update(Flight object) {

  }

  @Override
  public void delete(Flight object) {

  }

  @Override
  public void close() {

  }
}
