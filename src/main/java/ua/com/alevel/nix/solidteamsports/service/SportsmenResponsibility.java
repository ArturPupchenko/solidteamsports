package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Audience;

public class SportsmenResponsibility {

    public void getOnField(Audience audience){
        System.out.println("Выход спортсменов на поле");
    }

    public void playFirstHalf(Audience audience){
        System.out.println("Спортсмены играют первый тайм");
    }

    public void playSecondHalf(Audience audience){
        System.out.println("Спортсмены играют второй тайм");

    }
}
