package controler;

import entity.Flight;
import service.FlightServise;

import java.util.List;

public class FlightControler {
  FlightServise flightServise;

  public FlightControler(FlightServise flightServise) {
    this.flightServise = flightServise;
  }

  public List<Flight> getAllFlights(){return flightServise.getAllFlight();}
}
