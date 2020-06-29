package ua.com.alevel.nix.solidteamsports.data;

import ua.com.alevel.nix.solidteamsports.SportsmenResponsibility;
import ua.com.alevel.nix.solidteamsports.data.Audience;

public class Sportsmen {

    private SportsmenResponsibility sportsmenResponsibility = new SportsmenResponsibility();

    public void startGame(Audience audience){
        System.out.println("Оргнизация этапа турнира");
        System.out.println("Подготовка арены");
        System.out.println("Сбор аудитории");
        System.out.println("Сбор спортсменов");
        System.out.println("Объявление состава команд");
        sportsmenResponsibility.getOnField(audience);
        System.out.println("Арбитраж");
        sportsmenResponsibility.playFirstHalf(audience);
        System.out.println("Перерыв");
        sportsmenResponsibility.playSecondHalf(audience);
        System.out.println("Объявление результатов матча");
    }
}
