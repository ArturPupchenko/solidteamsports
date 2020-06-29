package ua.com.alevel.nix.solidteamsports;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.service.SportsmenService;

public class Main {

    public static void main(String[] args) {
        SportsmenService sportsmenService = new SportsmenService();
        sportsmenService.startGame(new Sportsmen(), new Audience());
    }
}
