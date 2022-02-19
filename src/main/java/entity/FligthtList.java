package entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FligthtList {
    Flight warsaw = new Flight(1,"A", "14/02/2022","5:40 ",     "Warsaw          ", "LOT         ", "LO756 ", 378);
    Flight larnaca = new Flight(2,"A", "10/05/2022","6:10 ",    "Larnaca         ", "Wizz Air    ", "W66259", 180);
    Flight bratislava = new Flight(3,"A", "24/12/2022","6:20 ", "Bratislava      ", "Wizz Air    ", "W66275",180);
    Flight athens = new Flight(4,"A", "15/09/2022","6:30 ",     "Athens          ", "Wizz Air    ", "W66267", 180);
    Flight оdesa = new Flight(5,"D", "14/12/2022","7:00 ",   "Odesa           ",    "Bees Airline", "7B103 ", 189);
    Flight tbilisi = new Flight(6,"A", "01/02/2022","7:05 ", "Tbilisi         ",    "Bees Airline", "7B331 ",189);
    Flight budapest = new Flight(7,"A", "28/06/2022","9:45 ","Budapest        ",    "Wizz Air    ",   "W62474",150);
    Flight lisbon = new Flight(8,"A", "22/10/2022","16:05", "Lisbon          ",       "Wizz Air    ", "W66191",180);
    Flight zaporizhzhia = new Flight(9,"D", "15/02/2022","21:15", "Zaporizhzhia    ", "Motor Sich  ", "M9202 ",100);

    List<Flight> allFlight = new ArrayList<>();
    public List<Flight> getAllFlight() {
        allFlight.add(warsaw);
        allFlight.add(larnaca);
        allFlight.add(bratislava);
        allFlight.add(athens);
        allFlight.add(оdesa);
        allFlight.add(tbilisi);
        allFlight.add(budapest);
        allFlight.add(lisbon);
        allFlight.add(zaporizhzhia);
        return allFlight;
    }

    public void setAllFlight(List<Flight> allFlight) {
        this.allFlight = allFlight;
    }

    public Map<Integer, Flight> getFlightList(){
        Map<Integer, Flight> flyList = new HashMap<>();
        flyList.put(1, warsaw);
        flyList.put(2, larnaca);
        flyList.put(3, bratislava);
        flyList.put(4, athens);
        flyList.put(5, оdesa);
        flyList.put(6, tbilisi);
        flyList.put(7, budapest);
        flyList.put(8, lisbon);
        flyList.put(9, zaporizhzhia);
        return flyList;
    }
    public void cadList(){
        Map<Integer, Flight> getflyList = getFlightList();
        System.out.println("                                    ***                                 ");
        System.out.println("  ***    Информация про все рейсы из Киева в ближайшие 24 часа    ***");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| № |    Дата    |  Время  | Место назначения |   Авиалинии  |  Рейс  |");
        for(Map.Entry<Integer, Flight> entry: getflyList.entrySet()) {
            Integer key = entry.getKey();
            Flight value = entry.getValue();
            System.out.println("|---------------------------------------------------------------------|");
            System.out.println("| "+key+" | " + value.getDate()
                    + " |  " + value.getLocalTime()+"  | "
                    + value.getDestination() + " | "
                    + value.getAirline() + " | "
                    + value.getFlight() + " |   ");
        }
        System.out.println("-----------------------------------------------------------------------");
    }

}
