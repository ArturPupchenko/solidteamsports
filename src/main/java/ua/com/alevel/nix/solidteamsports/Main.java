package ua.com.alevel.nix.solidteamsports;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.service.SportsmenService;
import ua.com.alevel.nix.solidteamsports.service.impl.SportsmenServiceImpl;

public class Main {

    public static void main(String[] args) {
        SportsmenService sportsmenService = new SportsmenServiceImpl();
        sportsmenService.startGame(new Sportsmen(), new Audience());
    }
}
