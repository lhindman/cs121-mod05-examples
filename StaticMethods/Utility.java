import java.util.Random;

/**
 * Utility class to demonstrate static methods
 * @author Luke Hindman
 */
public class Utility {
    
    /* static methods */

    /**
     * Return the max of three integer values
     * @param x Value to compare
     * @param y Value to compare
     * @param z Value to compare
     * @return max of the three values (x, y z)
     */
    public static int maxOfThree(int x, int y, int z) {
        int max = Math.max(x,y);
        max = Math.max(max,z);
        return max;
    }

    /**
     * Return the cube (x^3)
     * @param x Value to be cumbed
     * @return the result value cubed
     */
    public static int cube(int x) {
        return x * x * x;
    }

    /**
     * Return a random integer value in the specified range (inclusive)
     * @param low Lower bound of range of random values
     * @param high Upper bound of range of random values
     * @return integer value in range [low,high] 
     */
    public static int randomInRange(int low, int high) {
        Random rand = new Random();
        int value = rand.nextInt(high - low + 1) + low;
        return value;
    }

}
