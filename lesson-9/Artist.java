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

    // TODO: Define printInfo() method
    // If deathYear is entered as -1, only print birthYear
    public void printInfo() {
        System.out.println("");
    }

}
