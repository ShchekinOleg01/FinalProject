package entity;

import dao.BookingDao;
import dao.daoImpl.BookingDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BookingList {
    List<Booking> bookingList = new ArrayList<>();
    FligthtList fligthtList = new FligthtList();



    public void addToBooking (Booking ticket){
        Map<Integer, Flight> getflyList = fligthtList.getFlightList();
        for(Map.Entry<Integer, Flight> entry: getflyList.entrySet()) {
            Integer key = entry.getKey();
            Flight value = entry.getValue();
            if (Objects.equals(value.getDestination().trim(), ticket.getLocate()) &&
                    Objects.equals(value.getDate().trim(), ticket.getDate()) &&
                         ticket.getTickets() <= value.getFreeSeat()){

                System.out.println("Локация совпадает - " + ticket);
                System.out.println("resirve - " + ticket.getTickets());
                System.out.println("Free Tikets - " + value.getFreeSeat());
                Flight flight  = new Flight(0);
                int lostSeat = value.getFreeSeat() - ticket.getTickets();
                System.out.println("lostSeat - " + lostSeat);
                flight.setFreeSeat(lostSeat);
                CADFrame cadFrame = new CADFrame();
                System.out.println("Оставшийся рейс - " + value);
                cadFrame.getOne(key);



            }
            System.out.println("key - " + key);
            System.out.println("value - " +value);
            
        }


    };

}
