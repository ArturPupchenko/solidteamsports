package ua.com.alevel.nix.solidteamsports.service.impl;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.service.SportOrganizationResponsibility;
import ua.com.alevel.nix.solidteamsports.service.SportsmenResponsibility;
import ua.com.alevel.nix.solidteamsports.service.SportsmenService;

public class SportsmenServiceImpl implements SportsmenService<Audience> {

    private SportsmenResponsibility sportsmenResponsibility = new SportsmenResponsibilityImpl();
    private SportOrganizationResponsibility sportOrganizationResponsibility = new SportOrganizationResponsibilityImpl();

    @Override
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
