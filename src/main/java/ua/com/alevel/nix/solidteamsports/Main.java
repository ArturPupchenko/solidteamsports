package ua.com.alevel.nix.solidteamsports;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.service.impl.SportsmenServiceImpl;

public class Main {

    public static void main(String[] args) {
        SportsmenServiceImpl sportsmenServiceImpl = new SportsmenServiceImpl();
        sportsmenServiceImpl.startGame(new Sportsmen(), new Audience());
    }
}
