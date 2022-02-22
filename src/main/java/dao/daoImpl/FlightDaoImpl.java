package dao.daoImpl;

import dao.FlightDao;
import entity.CADFrame;
import entity.Flight;
import entity.FligthtList;
import entity.Scoreboard;


import java.io.*;
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

  public void getScoreboardFlight() throws IOException {
    fligthtList.cadList();
  }

  @Override
  public void getScoreboard() {
    scoreboard.cadTabloList();
  }

  @Override
  public void getFlightByID(int IDFlight) {
    if (IDFlight >= flightList.size()) {
      System.out.println("Нет такого индекса рейса : " + IDFlight + ", " + "null");
    }
    cadFrame.getOne(IDFlight);
  }
  public void writeFile() throws FileNotFoundException {
    List<Flight> list = fligthtList.getAllFlight();
    FileOutputStream fos = new FileOutputStream("Booking.txt");
    try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      for (Flight flight : list) {
        oos.writeObject(flight);
      }
    } catch (IOException e) {
      System.out.println("ERROR - " + e);
    }
    System.out.println("Запись в файл - Booking.txt, прошла успешно!!!");
  }

  public void loadData() throws IOException {
    FileInputStream fis = new FileInputStream("Booking.txt");
    ObjectInputStream oin = new ObjectInputStream(fis);
    List<Flight> list = fligthtList.getAllFlight();
    while (true) {
      try {
        list.add((Flight) oin.readObject());
      } catch (EOFException e) {
        System.out.println("Нет данных");
        break;
      } catch (StreamCorruptedException | ClassNotFoundException e) {
        e.printStackTrace();
        System.out.println("Нет данных");
      }
    }
    System.out.println("Считывание данных прошло успешно!!!");
    System.out.println(fligthtList.getAllFlight());
    fis.close();
  }


  @Override
  public void create(Flight object) {
  }

  @Override
  public void getById(int id) {
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
