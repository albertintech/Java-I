package InstrumentInfo;

// Define a class: StringInstrument that is derived from the Instrument class
public class StringedInstrument extends Instrument {
    // Declare private fields: numStrings, numFrets
    private int numStrings;
    private int numFrets;

    // Define mutator methods -
    // setNumOfStrings(), setNumOfFrets()
    public void setNumOfStrings(int numOfStrings) {
        numStrings = numOfStrings;
    }

    public void setNumOfFrets(int numOfFrets) {
        numFrets = numOfFrets;
    }

    // Define accessor methods -
    // getNumOfStrings(), getNumOfFrets()
    public int getNumOfStrings() {
        return numStrings;
    }

    public int getNumOfFrets() {
        return numFrets;
    }
}
