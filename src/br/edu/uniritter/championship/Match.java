package br.edu.uniritter.championship;

/**
 *
 * @author alu201011612
 */
public class Match {

    private Team teamHome;
    private Team teamVisitor;
    private Integer teamHomeGoal;
    private Integer teamVisitorGoal;

    public Match(Team teamHome, Team teamVisitor, Integer teamHomeGoal, Integer teamVisitorGoal) {
        this.teamHome = teamHome;
        this.teamVisitor = teamVisitor;
        this.teamHomeGoal = teamHomeGoal;
        this.teamVisitorGoal = teamVisitorGoal;
    }

    public Team getWinner() {
        Team winner = new Team("Empate");
        
        if (teamHomeGoal > teamVisitorGoal) {
            winner = teamHome;
        } else
        if (teamVisitorGoal > teamHomeGoal) {
            winner = teamVisitor;
        }
        
        return winner;
    }

    public boolean isDraw() {
        return (teamHomeGoal == teamVisitorGoal);
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public Team getTeamVisitor() {
        return teamVisitor;
    }

}
