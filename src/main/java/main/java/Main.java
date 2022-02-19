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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static entity.Booking.countBooking;

public class Main {
  public static void main(String[] args) {
    FlightDao flightDAO = DaoFactoryImpl.createFlightDao();
    FlightServise flightServise = new FlightServise(flightDAO);
    FlightControler flightControler = new FlightControler(flightServise);


    BookingDao bookingDao = DaoFactory.createBookingDao();
    BookingService bookingService = new BookingService(bookingDao);
    BookingControler bookingControler = new BookingControler(bookingService);


    Scanner in = new Scanner(System.in);
    System.out.print("Input name: ");
    String name = in.nextLine();
    System.out.println("Hello my friend " + name + " please choose your number");

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
          int Tickets =0;
          System.out.println("Введите место назначения, дата, количество человек (сколько необходимо купить билетов).");
          System.out.println(" 1- Место назначения?");
          String Location = in.nextLine();
          System.out.println(" 2- Дата");
          String Date = in.nextLine();
          System.out.println(" 3-  Количество билетов");
          Tickets = Integer.parseInt(in.nextLine());
          int countBooking = 0;
          int id = countBooking;
         // bookingControler.getAllBookings();
          bookingControler.bookingFlight(id,Location, Date,Tickets);

        }
        if (num == 4) {
          System.out.println("NUMBER  - " + 4);
        }
        if (num == 5) {
          System.out.println("NUMBER  - " + 5);
        }
        if (num == 6) {
          return;
        }
       if (num > flightControler.getAllFlights().size()) {
         System.out.println("Введите число меньше - " +flightControler.getAllFlights().size());
        }

      } catch (NumberFormatException e) {
        System.err.println("\n" + "Wrong string format!");
        System.out.println(num + " please, try again only numbers.");
      }
    }
  }
}

