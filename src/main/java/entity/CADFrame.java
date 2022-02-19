package entity;

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
}
