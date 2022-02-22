package main.java;

import controler.BookingControler;
import controler.FlightControler;
import dao.BookingDao;
import dao.DaoFactory;
import dao.FlightDao;
import dao.daoImpl.BookingDaoImpl;
import dao.daoImpl.DaoFactoryImpl;
import entity.*;
import service.BookingService;
import service.FlightServise;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    FlightDao flightDAO = DaoFactoryImpl.createFlightDao();
    FlightServise flightServise = new FlightServise(flightDAO);
    FlightControler flightControler = new FlightControler(flightServise);

    BookingDaoImpl bookingDao = new BookingDaoImpl();
    BookingService bookingService = new BookingService(bookingDao);
    BookingControler bookingControler = new BookingControler(bookingService);

    Scanner in = new Scanner(System.in);
    while (true) {
      flightControler.getScoreboard();
      System.out.println("Please enter number only");
      int num = 0;
      try {
        num = Integer.parseInt(in.nextLine());
        if (num == 1) {
          flightControler.getScoreboardFlight();
        }
        if (num == 2) {
          System.out.println("Введите айди рейса для поиска в базе данных.");
          num = Integer.parseInt(in.nextLine());
          flightControler.getFlightByID(num);
        }
        if (num == 3) {
          int tickets =0;
          System.out.println("Введите место назначения, дата, количество человек (сколько необходимо купить билетов).");
          System.out.println(" 1- Место назначения?");
          String location = in.nextLine();
          System.out.println(" 2- Дата?");
          String date = in.nextLine();
          System.out.println(" 3-  Количество необходимых билетов?");
          tickets = Integer.parseInt(in.nextLine());
          int countBooking = 0;
          int id = countBooking;
          bookingControler.bookingFlight(id, location,date,tickets);
        }
        if (num == 4) {
         bookingControler.canceled();
        }
        if (num == 5) {
          bookingControler.showFlight();
        }
        if (num == 6) {
          return;
        }
        if (num == 7) {
          flightControler.loadData();
        }
        if (num == 8) {
          flightControler.writeFile();
        }
       if (num > flightControler.getAllFlights().size()) {
         System.out.println("Введите число меньше - " + flightControler.getAllFlights().size());
        }

      } catch (NumberFormatException e) {
        System.err.println("\n" + "Wrong string format!");
        System.out.println(num + " please, try again only numbers.");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

