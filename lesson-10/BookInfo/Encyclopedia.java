package BookInfo;

public class Encyclopedia extends Book {
    // Declare private fields: edition, numVolumes
    private String edition;
    private int numVolumes;

    // Define mutator methods -
    // setEdition(), setNumVolumes()
    public void setEdition(String ed) {
        edition = ed;
    }

    public void setNumVolumes(int volumes) {
        numVolumes = volumes;
    }

    // Define accessor methods -
    // getEdition(), getNumVolumes()
    public String getEdition() {
        return edition;
    }

    public int getNumVolumes() {
        return numVolumes;
    }

    // Define a printInfo() method that overrides
    // the printInfo in Book class
    @Override
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Volumes: " + numVolumes);
    }
}
