/**
 * The purpose of this example is to demonstrate the use of
 * static methods with Object references. We will over the
 * Die class in more detail in Module 6.
 * 
 * @author Luke Hindman
 */

public class MaxDie 
{
    public static void main(String[] args) 
    {
        /* Instantiate two new Die objects */
        Die die1 = new Die();
        Die die2 = new Die();
        Die max;

        /* Roll each die */
        die1.roll();
        die2.roll();

        /* Display the result of each roll */
        System.out.println("Die1 Face Value: " + die1.getFaceValue());
        System.out.println("Die2 Face Value: " + die2.getFaceValue());

        /* Call our getMax static method to get a reference to the die
         *   with the highest face value. */
        max = getMax(die1, die2);
        System.out.println("Face value of max die: " + max.getFaceValue());
    }

    /**
     * Compare the faceValue of two Die objects and return a reference
     *    to the Die with the greater faceValue. If both d1 and d2 have 
     *    same faceValue, return d1.
     * @param d1 Die object to be compared
     * @param d2 Die object to be compared
     * @return Reference to whichever has larger faceValue, d1 or d2
     */
    public static Die getMax(Die d1, Die d2) 
    {
        if (d1.getFaceValue() >= d2.getFaceValue()) 
        {
            return d1;
        } 
        else 
        {
            return d2;
        }
    }
}