package entity;

import java.util.List;
import java.util.stream.Collectors;

public class CADFrame {
    FligthtList fligthtList = new FligthtList();

    public void getOne(int id) {
        Flight one = fligthtList.getAllFlight().get(id-1);
        System.out.println("               ***    Информация о выбранном рейсе №: " + one.getId() + "    ***");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("| № |    Дата    |  Время  | Место назначения |   Авиалинии  |  Рейс  | Свободных мест |");
        System.out.println("|--------------------------------------------------------------------------------------|");
        System.out.println("| "+one.getId()+" | " + one.getDate()
                    + " |  " + one.getLocalTime()+"  | "
                    + one.getDestination() + " | "
                    + one.getAirline() + " | "
                    + one.getFlight() + " |  " +
                    "     " +one.getFreeSeat() + "      |  " +
                   " ");

       System.out.println("----------------------------------------------------------------------------------------");
    }
    public void getSearchFlight(List<Flight> flightList){
        System.out.println("        ***         Список рейсов по выбранному  направлению      ***    ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("| №  |    Дата    |  Время  | Место назначения |   Авиалинии  |  Рейс  | Свободных мест |");
        System.out.println("|---------------------------------------------------------------------------------------|");
        flightList.stream().forEach(print -> {

            System.out.println("| "+(print.getId()< 10 ? (print.getId() + " ") : print.getId())+" | " + print.getDate()
                    + " |  " + print.getLocalTime()+"  | "
                    + print.getDestination() + " | "
                    + print.getAirline() + " | "
                    + print.getFlight() + " |  " +
                    "     " +print.getFreeSeat() + "      |  " +
                    " ");

            System.out.println("-----------------------------------------------------------------------------------------");
        });
    }
}
