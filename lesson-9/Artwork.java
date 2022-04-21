public class Artwork {

    private String title;
    private int yearCreated;
    private Artist artist;

    public Artwork() {
        title = "unknown";
        yearCreated = -1;
    }

    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public Artwork(String userTitle, int userYearCreated, Artist userArtist) {
        title = userTitle;
        yearCreated = userYearCreated;
        artist = userArtist;
    }

    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + title + ", " + yearCreated);
    }
}
