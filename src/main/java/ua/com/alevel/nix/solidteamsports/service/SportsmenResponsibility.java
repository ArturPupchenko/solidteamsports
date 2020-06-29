package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Audience;

public interface SportsmenResponsibility {
    void getOnField(Audience audience);

    void playFirstHalf(Audience audience);

    void playSecondHalf(Audience audience);
}
