package controler;

import entity.Flight;
import service.FlightServise;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FlightControler {
  FlightServise flightServise;

  public FlightControler(FlightServise flightServise) {
    this.flightServise = flightServise;
  }
  public List<Flight> getAllFlights() {return flightServise.getAllFlights();};
  public void getScoreboard (){flightServise.getScoreboard();};
  public void getScoreboardFlight() throws IOException {
    flightServise.getScoreboardFlight();
  }
  public Flight getFlightByID(int IDFlight) {
    flightServise.getFlightByID(IDFlight);
    return null;
  }
  public Map<Integer, Flight> loadData() throws IOException {
    flightServise.loadData();
    return null;
  }
  public void writeFile() throws IOException {
    flightServise.writeFile();
  }
}
