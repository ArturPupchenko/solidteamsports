package ua.com.alevel.nix.solidteamsports;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;

public class Main {

    public static void main(String[] args) {
        Sportsmen sportsmen = new Sportsmen();
        sportsmen.startGame(new Audience());
    }
}
