package dao;

import entity.Booking;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface BookingDao {
    public void bookingFlight(int id, String location, String date, int tickets);
}