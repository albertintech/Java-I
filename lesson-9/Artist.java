public class Artist {

    private String artistName;
    private int birthYear;
    private int deathYear;

    public Artist() {
        artistName = "unknown";
        birthYear = -1;
        deathYear = -1;
    }

    public Artist(String userArtistName, int userBirthYear, int userDeathYear) {
        artistName = userArtistName;
        userBirthYear = birthYear;
        userDeathYear = deathYear;
    }

    public String getName() {
        return artistName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void printInfo() {
        if (deathYear > 0 && birthYear > 0) {
            System.out.print("Artist: " + artistName);
            System.out.print(" (" + birthYear + " to ");
            System.out.println(deathYear + ")");
        } else if (birthYear > 0 && deathYear < 0) {
            System.out.print("Artist: " + artistName);
            System.out.print(" (" + birthYear + " to ");
            System.out.println("present)");
        } else {
            System.out.print("Artist: " + artistName);
            System.out.println(" (unknown)");
        }

    }

}
