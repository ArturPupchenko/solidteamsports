package ua.com.alevel.nix.solidteamsports.service.impl;

import ua.com.alevel.nix.solidteamsports.config.ObjectFactory;
import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.service.SportOrganizationResponsibility;
import ua.com.alevel.nix.solidteamsports.service.SportsmenResponsibility;
import ua.com.alevel.nix.solidteamsports.service.SportsmenService;

public class SportsmenServiceImpl implements SportsmenService<Audience> {

    private SportsmenResponsibility sportsmenResponsibility = ObjectFactory.getInstance().createObject(SportsmenResponsibility.class);
    private SportOrganizationResponsibility sportOrganizationResponsibility = ObjectFactory.getInstance().createObject(SportOrganizationResponsibility.class);

    @Override
    public void startGame(Sportsmen sportsmen, Audience audience) {
        sportOrganizationResponsibility.organizationOfTournament(sportsmen, audience);
        sportsmenResponsibility.getOnField(audience);
        sportOrganizationResponsibility.arbitration(sportsmen);
        sportsmenResponsibility.playFirstHalf(audience);
        sportOrganizationResponsibility.makeBreak(sportsmen, audience);
        sportsmenResponsibility.playSecondHalf(audience);
        sportOrganizationResponsibility.announcementOfResults(sportsmen, audience);
    }
}
