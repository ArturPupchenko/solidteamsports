package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;

public class SportsmenService {

    private SportsmenResponsibility sportsmenResponsibility = new SportsmenResponsibility();
    private SportOrganizationResponsibility sportOrganizationResponsibility = new SportOrganizationResponsibility();

    public void startGame(Sportsmen sportsmen, Audience audience){
        sportOrganizationResponsibility.organizationOfTournament(sportsmen,audience);
        sportsmenResponsibility.getOnField(audience);
        sportOrganizationResponsibility.arbitration(sportsmen);
        sportsmenResponsibility.playFirstHalf(audience);
        sportOrganizationResponsibility.makeBreak(sportsmen,audience);
        sportsmenResponsibility.playSecondHalf(audience);
        sportOrganizationResponsibility.announcementOfResults(sportsmen,audience);
    }
}
