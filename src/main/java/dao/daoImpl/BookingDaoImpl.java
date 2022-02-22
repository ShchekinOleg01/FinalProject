package dao.daoImpl;
import dao.BookingDao;
import entity.CADFrame;
import entity.Flight;
import entity.FligthtList;

import java.io.*;
import java.util.*;


public class BookingDaoImpl implements BookingDao {

  FligthtList fligthtList = new FligthtList();
  Map<Integer, Flight> getflyList = fligthtList.getFlightList();

  @Override
  public void bookingFlight(int id, String location, String date, int tickets) {
  }
}

