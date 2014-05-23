package br.edu.uniritter.championship;

/**
 *
 * @author alu201011612
 */
class Championship {

    public Team[] teams = new Team[4];
    public Match[] matches = new Match[6];
    public Classification[] classifications = new Classification[4];

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

    public Championship(Team[] teams, Match[] matches) {
        this.teams = teams;
        this.matches = matches;
        
        this.calculate();
        this.order();
    }

    public Team getFirstTeam() {
        return classifications[0].getTeam();
    }

    public Team getSecondTeam() {
        return classifications[1].getTeam();
    }

    public void calculate() {
        for(int i = 0; i < teams.length; i++) {
            classifications[i] = new Classification(teams[i], 0);
            
            for(Match match : matches) {
                classifications[i].addPoints(calculateTeamMatch(teams[i], match));
            }
        }
    }

    public void order() {
        Classification classificationOrder;
        
        for(int i = 0; i < classifications.length - 1; i++) {
            if (classifications[i].getPoints() < classifications[i + 1].getPoints()) {
                classificationOrder = classifications[i];
                
                classifications[i] = classifications[i + 1];
                classifications[i + 1] = classificationOrder;
            }
        }
    }
}
