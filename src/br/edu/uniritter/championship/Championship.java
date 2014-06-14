package br.edu.uniritter.championship;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alu201011612
 */
class Championship {

    public List<Team> teams;
    public List<Match> matches;
    public List<Classification> classifications;

    public static int calculateTeamMatch(Team team, Match match) {
        if (match.isDraw()) {
            return 1;
        } else
        if (match.getWinner().equals(team)) {
            return 3;
        } else {
            return 0;
        }
    }

    public Championship(List<Team> teams, List<Match> matches) {
        this.teams = new LinkedList(teams);
        this.matches = new LinkedList(matches);
        
        this.createClassification();
        this.sortClassification();
    }

    public Team getFirstTeam() {
        return classifications.get(0).getTeam();
    }

    public Team getSecondTeam() {
        return classifications.get(1).getTeam();
    }

    private void createClassification() {
        this.classifications = new LinkedList();
        
        for(Team team : teams) {
            Classification classification = new Classification(team);
            
            for(Match match : matches) {
                classification.addPoints(calculateTeamMatch(team, match));
            }
            
            classifications.add(classification);
        }
    }

    private void sortClassification() {
        Collections.sort(classifications);
    }

}
