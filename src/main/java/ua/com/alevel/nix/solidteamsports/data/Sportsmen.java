package ua.com.alevel.nix.solidteamsports.data;

import ua.com.alevel.nix.solidteamsports.SportOrganizationResponsibility;
import ua.com.alevel.nix.solidteamsports.SportsmenResponsibility;
import ua.com.alevel.nix.solidteamsports.data.Audience;

public class Sportsmen {

    private SportsmenResponsibility sportsmenResponsibility = new SportsmenResponsibility();
    private SportOrganizationResponsibility sportOrganizationResponsibility = new SportOrganizationResponsibility();

    public void startGame(Audience audience){
        sportOrganizationResponsibility.organizationOfTournament(sportsmen,audience);
        sportsmenResponsibility.getOnField(audience);
        sportOrganizationResponsibility.arbitration(sportsmen);
        sportsmenResponsibility.playFirstHalf(audience);
        sportOrganizationResponsibility.makeBreak(sportsmen,audience);
        sportsmenResponsibility.playSecondHalf(audience);
        sportOrganizationResponsibility.announcementOfResults(sportsmen,audience);
    }
}
