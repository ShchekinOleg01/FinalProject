package entity;

import java.util.HashMap;
import java.util.Map;

public class Scoreboard {
    ScoreboardItem tabloList_1 = new ScoreboardItem("Онлайн-табло                 ");
    ScoreboardItem tabloList_2 = new ScoreboardItem("Посмотреть информацию о рейсе");
    ScoreboardItem tabloList_3 = new ScoreboardItem("Поиск и бронировка рейса     ");
    ScoreboardItem tabloList_4 = new ScoreboardItem("Отменить бронирование        ");
    ScoreboardItem tabloList_5 = new ScoreboardItem("Мои рейсы                    ");
    ScoreboardItem tabloList_6 = new ScoreboardItem("Выход                        ");

    public Map<Integer, ScoreboardItem> getTabloList(){
        Map<Integer, ScoreboardItem> tabloList = new HashMap<>();
        tabloList.put(1, tabloList_1);
        tabloList.put(2, tabloList_2);
        tabloList.put(3, tabloList_3);
        tabloList.put(4, tabloList_4);
        tabloList.put(5, tabloList_5);
        tabloList.put(6, tabloList_6);
        return tabloList;
    }

    public void cadTabloList(){
        Scoreboard tabloList = new Scoreboard();
        Map<Integer, ScoreboardItem> getTabloList = tabloList.getTabloList();
        System.out.println("               ***              ");
        System.out.println("    ***    Главное меню     ***      ");
        System.out.println("-----------------------------------------");
        System.out.println("| № |   Наименование                   |");
        for(Map.Entry<Integer, ScoreboardItem> entry: getTabloList.entrySet()) {
            Integer key = entry.getKey();
            ScoreboardItem value = entry.getValue();
            System.out.println("|--------------------------------------|");
            System.out.println("| "+key+" | " + value.getContent() +"    |");
        }    System.out.println("---------------------------------------");
    }

}
