package dao;

import entity.Flight;

import java.util.List;

public interface FlightDao extends DAO<Flight> {
  List<Flight> getAllFlights();

  Flight getFlightByIndex(int i);

  void deleteFlight(Flight family);

  void deleteFlight(int i);

  void saveFlight(Flight family);
}
