import java.util.Scanner;

public class TeamStats {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Team team = new Team();

        String name = scnr.next();
        int wins = scnr.nextInt();
        int losses = scnr.nextInt();

        team.setName(name);
        team.setWins(wins);
        team.setLosses(losses);

        team.printStanding();
    }
}
