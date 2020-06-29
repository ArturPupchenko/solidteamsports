package ua.com.alevel.nix.solidteamsports.service;

import ua.com.alevel.nix.solidteamsports.data.Audience;
import ua.com.alevel.nix.solidteamsports.data.Sportsmen;
import ua.com.alevel.nix.solidteamsports.data.abstr.SportEventViewers;

public interface SportOrganizationResponsibility <L extends SportEventViewers> {

    void organizationOfTournament(Sportsmen sportsmen, L l);

    void arbitration(Sportsmen sportsmen);

    void makeBreak(Sportsmen sportsmen, L l);

    void announcementOfResults(Sportsmen sportsmen, L l);
}
