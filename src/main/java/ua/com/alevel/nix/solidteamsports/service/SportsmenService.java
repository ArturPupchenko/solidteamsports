package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.data.abstr.SportEventViewers;

public interface SportsmenService <L extends SportEventViewers> {
    void startGame(Sportsmen sportsmen, L l);
}
