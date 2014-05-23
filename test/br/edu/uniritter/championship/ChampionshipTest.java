package br.edu.uniritter.championship;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alu201011612
 */
public class ChampionshipTest {

    private Team[] teams;
    private Match[] matches;
    private Championship championship;

    @Before
    public void setUp() {
        teams = new Team[4];
        teams[0] = new Team("Brasil");
        teams[1] = new Team("México");
        teams[2] = new Team("Cróacia");
        teams[3] = new Team("Camarões");
        
        matches = new Match[6];
        matches[0] = new Match(teams[0], teams[1], 3, 1);
        matches[1] = new Match(teams[0], teams[2], 3, 1);
        matches[2] = new Match(teams[0], teams[3], 3, 1);
        matches[3] = new Match(teams[1], teams[2], 3, 1);
        matches[4] = new Match(teams[1], teams[3], 3, 1);
        matches[5] = new Match(teams[2], teams[3], 3, 1);
        
        championship = new Championship(teams, matches);
    }
 
    @Test
    public void testFirstTeamIsBrasil() {
        assertEquals(teams[0].getName(), championship.getFirstTeam().getName());
    }

    @Test
    public void testSecondTeamIsMexico() {
        assertEquals(teams[1].getName(), championship.getSecondTeam().getName());
    }

    @Test
    public void testBrasilWinMexico() {
        assertEquals(3, Championship.calculateTeamMatch(teams[0], matches[0]));
        assertEquals(0, Championship.calculateTeamMatch(teams[1], matches[0]));
    }

}
