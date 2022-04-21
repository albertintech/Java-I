import java.util.Scanner;

public class ArtworkLabel {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userTitle, userArtistName;
        int yearCreated, userBirthYear, userDeathYear;

        userArtistName = scnr.nextLine();
        userBirthYear = scnr.nextInt();
        scnr.nextLine();
        userDeathYear = scnr.nextInt();
        scnr.nextLine();
        userTitle = scnr.nextLine();
        yearCreated = scnr.nextInt();

        Artist userArtist = new Artist(userArtistName, userBirthYear, userDeathYear);
        System.out.println(userBirthYear);
        System.out.println(userDeathYear);
        
        Artwork newArtwork = new Artwork(userTitle, yearCreated, userArtist);

        newArtwork.printInfo();
    }
}
