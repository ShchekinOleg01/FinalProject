package entity;

import java.util.*;

public class BookingPay {
    private long id;
    private String name;
    private String sureName;
    int reservedSeat;
    Flight flight;
    static int numberPay = 0;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookingPay(long id, String name, String sureName,int reservedSeat, Flight flight) {
        numberPay++;
        this.name = name;
        this.sureName = sureName;
        this.reservedSeat = reservedSeat;
        this.flight = flight;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(int reservedSeat) {
        this.reservedSeat = reservedSeat;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    Date date = new Date();
    String str = String.format("Lата и время: %tc", date);

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return str + "Фамилия плательщика"+ sureName + "{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", reservedSeat=" + reservedSeat +
                ", flight=" + flight +
                '}';
    }
}
