package br.edu.uniritter.championship;

import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alu201011612
 */
public class ChampionshipTest {

    private List<Team> teams;
    private List<Match> matches;
    private Championship championship;

    @Before
    public void setUp() {
        teams = new LinkedList();
        teams.add(new Team("Brasil"));
        teams.add(new Team("México"));
        teams.add(new Team("Cróacia"));
        teams.add(new Team("Camarões"));

        matches = new LinkedList();
        matches.add(new Match(teams.get(0), teams.get(1), 3, 1));
        matches.add(new Match(teams.get(0), teams.get(2), 3, 1));
        matches.add(new Match(teams.get(0), teams.get(3), 3, 1));
        matches.add(new Match(teams.get(1), teams.get(2), 3, 1));
        matches.add(new Match(teams.get(1), teams.get(3), 3, 1));
        matches.add(new Match(teams.get(2), teams.get(3), 3, 1));

        championship = new Championship(teams, matches);
    }

    @Test
    public void testFirstTeamIsBrasil() {
        assertEquals(teams.get(0), championship.getFirstTeam());
    }

    @Test
    public void testSecondTeamIsMexico() {
        assertEquals(teams.get(1), championship.getSecondTeam());
    }

    @Test
    public void testBrasilWinMexico() {
        assertEquals(3, Championship.calculateTeamMatch(teams.get(0), matches.get(0)));
        assertEquals(0, Championship.calculateTeamMatch(teams.get(1), matches.get(0)));
    }

}
