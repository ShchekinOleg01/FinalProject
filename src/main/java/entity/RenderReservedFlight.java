package entity;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class RenderReservedFlight {
    private List<BookingPay> bookingPays;

    public RenderReservedFlight(List<BookingPay> bookingPays) {
        this.bookingPays = bookingPays;
    }

    public List<BookingPay> getBookingPays() {
        return bookingPays;
    }

    public void setBookingPays(List<BookingPay> bookingPays) {
        this.bookingPays = bookingPays;

    }
    public void render(){
        System.out.println("                                                ***                                 ");
        System.out.println("  ***                             Список забранированных рейсов              ***");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("| № |         Дата бронирования           |    Время    | Место назначения | Резерв мест |    Фамилия   |");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        bookingPays.forEach(item -> {
            Date date = item.getDate();
            String surName = item.getSureName();
            String name =  item.getName();
            String locate = item.getFlight().getDestination();
            String destination = item.getFlight().getDate();
            int free = item.getReservedSeat();

            System.out.println("| "+ item.getFlight().getId() +" |     "+date+"    | "+destination+"  | "+locate+ " |     " +free+"      |" + surName+"  ");
            System.out.println("---------------------------------------------------------------------------------------------------------");

           });
        }
    // 01/02/2022 |  17:05  | Macedonia
    // 28/06/2022 |  19:45  | Malta
    //22/10/2022 |  21:05  | Moscow
    @Override
    public String toString() {
        return "RenderReservedFlight{" + "//n" +
                "bookingPays=" + bookingPays +
                '}';
    }
}
