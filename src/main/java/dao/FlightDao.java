package dao;
import entity.Flight;

import java.util.List;


public interface FlightDao extends DAO<Flight>{

    void getScoreboardFlight();
   void getScoreboard();
    List<Flight> getAllFlights();
    Flight getFlightByID(int IDFlight);

    void deleteFlight(Flight family);
    void deleteFlight(int i);
    void saveFlight(Flight family);
}
