public class Team {
    // TODO: Declare private fields - name, wins, losses
    private String name;
    private int wins;
    private int losses;

    // TODO: Define mutator methods -
    // setName(), setWins(), setLosses()
    public void setName(String userName) {
        name = userName;
    }

    public void setWins(int userWins) {
        wins = userWins;
    }

    public void setLosses(int userLosses) {
        losses = userLosses;
    }

    // TODO: Define accessor methods -
    // getName(), getWins(), getLosses()
    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    // TODO: Define getWinPercentage()
    public double getWinPercentage() {
        return wins / (double) (wins + losses);
    }

    // TODO: Define printStanding()
    public void printStanding() {
        System.out.print("Win percentage: ");
        System.out.printf("%.2f", getWinPercentage());
        System.out.println();
        if (getWinPercentage() > 0.5) {
            System.out.println("Congratulations, Team " + name + " has a winning average!");
        } else {
            System.out.println("Team " + name + " has a losing average.");
        }
    }

}
