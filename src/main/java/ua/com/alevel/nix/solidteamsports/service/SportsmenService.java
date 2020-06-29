package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;

public interface SportsmenService {
    void startGame(Sportsmen sportsmen, Audience audience);
}
