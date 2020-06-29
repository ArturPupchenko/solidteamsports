package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;

public interface SportOrganizationResponsibility {
    void organizationOfTournament(Sportsmen sportsmen, Audience audience);

    void arbitration(Sportsmen sportsmen);

    void makeBreak(Sportsmen sportsmen, Audience audience);

    void announcementOfResults(Sportsmen sportsmen, Audience audience);
}
