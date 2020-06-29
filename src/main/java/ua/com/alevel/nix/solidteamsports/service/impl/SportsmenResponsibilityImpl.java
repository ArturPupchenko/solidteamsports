package ua.com.alevel.nix.solidteamsports.service.impl;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.service.SportsmenResponsibility;

public class SportsmenResponsibilityImpl implements SportsmenResponsibility {

    @Override
    public void getOnField(Audience audience){
        System.out.println("Выход спортсменов на поле");
    }

    @Override
    public void playFirstHalf(Audience audience){
        System.out.println("Спортсмены играют первый тайм");
    }

    @Override
    public void playSecondHalf(Audience audience){
        System.out.println("Спортсмены играют второй тайм");

    }
}
