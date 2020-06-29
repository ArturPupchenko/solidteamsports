package ua.com.alevel.nix.solidteamsports;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;

public class SportOrganizationResponsibility {

    public void organizationOfTournament(Sportsmen sportsmen, Audience audience){
        System.out.println("Оргнизация этапа турнира");
        System.out.println("Подготовка арены");
        System.out.println("Сбор аудитории");
        System.out.println("Сбор спортсменов");
        System.out.println("Объявление состава команд");
    };

    public void arbitration(Sportsmen sportsmen){
        System.out.println("Арбитраж");
    }

    public void makeBreak(Sportsmen sportsmen, Audience audience){
        System.out.println("Перерыв");
    }

    public void announcementOfResults(Sportsmen sportsmen, Audience audience){
        System.out.println("Объявление результатов матча");
    }






}
