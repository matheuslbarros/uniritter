package br.edu.uniritter.championship;

/**
 *
 * @author alu201011612
 */
class Classification implements Comparable<Classification> {

    public final static Integer INITIAL_POINTS = 0;

    public Team team;
    public Integer points;

    public Classification(Team team) {
        this.team = team;
        this.points = INITIAL_POINTS;
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

    @Override
    public int compareTo(Classification classification) {
        return classification.points - points;
    }

}
