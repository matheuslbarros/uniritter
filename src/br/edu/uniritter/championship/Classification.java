package br.edu.uniritter.championship;

/**
 *
 * @author alu201011612
 */
class Classification {

    public Team team;
    public Integer points;

    public Classification(Team team, Integer points) {
        this.team = team;
        this.points = points;
    }

    public Team getTeam() {
        return team;
    }

    public Integer getPoints() {
        return points;
    }

    public void addPoints(Integer points) {
        this.points += points;
    }
    
}
