package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.abstr.SportEventViewers;

public interface SportsmenResponsibility <L extends SportEventViewers> {
    void getOnField(Audience audience);

    void playFirstHalf(Audience audience);

    void playSecondHalf(Audience audience);
}
