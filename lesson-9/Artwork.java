public class Artwork {

    private String title;
    private int yearCreated;
    private Artist artist;

    public Artwork() {
        title = "NoTitle";
        yearCreated = 0;
    }

    public String getTitle(String userTitle) {
        return title;
    }

    public int getYearCreated(int userYearCreated) {
        return yearCreated;
    }

    public Artwork(String userTitle, int userYearCreated, Artist userArtist) {
        title = userTitle;
        yearCreated = userYearCreated;
        artist = userArtist;
    }

    public void printInfo() {
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title + ", " + yearCreated);
    }
}
