package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.abstr.SportEventViewers;

public interface SportsmenResponsibility <L extends SportEventViewers>{

    void getOnField(L l);

    void playFirstHalf(L l);

    void playSecondHalf(L l);
}
