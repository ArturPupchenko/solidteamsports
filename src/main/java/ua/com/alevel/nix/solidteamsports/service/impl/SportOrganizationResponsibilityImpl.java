package ua.com.alevel.nix.solidteamsports.service.impl;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.service.SportOrganizationResponsibility;

public class SportOrganizationResponsibilityImpl implements SportOrganizationResponsibility<Audience> {

    @Override
    public void organizationOfTournament(Sportsmen sportsmen, Audience audience){
        System.out.println("Оргнизация этапа турнира");
        System.out.println("Подготовка арены");
        System.out.println("Сбор аудитории");
        System.out.println("Сбор спортсменов");
        System.out.println("Объявление состава команд");
    }

    @Override
    public void arbitration(Sportsmen sportsmen){
        System.out.println("Арбитраж");
    }

    @Override
    public void makeBreak(Sportsmen sportsmen, Audience audience){
        System.out.println("Перерыв");
    }

    @Override
    public void announcementOfResults(Sportsmen sportsmen, Audience audience){
        System.out.println("Объявление результатов матча");
    }






}
