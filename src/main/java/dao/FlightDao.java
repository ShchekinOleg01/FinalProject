package dao;
import entity.Flight;

import java.io.IOException;
import java.util.List;

public interface FlightDao extends DAO<Flight>{
    void getScoreboardFlight() throws IOException;
    void getScoreboard();
    List<Flight> getAllFlights();
    void getFlightByID(int IDFlight);
    void loadData() throws IOException;
    void writeFile() throws IOException;

}
