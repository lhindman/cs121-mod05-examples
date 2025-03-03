import java.util.Random;

/**
 * The Die class represents a single Die object for use
 *    in game development.
 * @author Luke Hindman
 */
public class Die {
    /* 1. Instance Variables */
    private int faceValue;
    private int numSides;

    /* 2. Constructor(s) */
    /**
     * Default constructor for Die object. Sets faceValue to 1 and 
     *    initizes Die with six sides.
     */
    public Die() {
        faceValue = 1;
        numSides = 6;
    }

    /* 3. Other methods */

    public int roll() {
        Random gen = new Random();
        this.faceValue = gen.nextInt(this.numSides) + 1;
        return this.faceValue;
    }

    /**
     * Get the current faceValue
     * @return The current faceValue of the Die
     */
    public int getFaceValue() {
        return this.faceValue;
    }


    public String toString() {
        String output  = "";

        output += "The value of my beautiful " + this.numSides + " sided die is: " + this.faceValue;

        return output;
    }
}
