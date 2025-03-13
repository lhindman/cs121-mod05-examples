import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 * Implementation of the classic "magic 8-ball" using an ArrayList
 * @author Luke Hindman
 */
public class MagicEightBall {
    

    public static void main(String[] args) 
    {
        /* Declare a reference variable named responses that
         *   holds a reference to the newly instanciated ArrayList object */
        ArrayList<String> responses = new ArrayList<String>();

        /* Declare a reference variable named kbd that
         *   holds a reference to the newly instanciated Scanner object */
        Scanner kbd = new Scanner(System.in);

        /* Declare a reference variable named rand that
         *   holds a reference to the newly instanciated Random object */
        Random rand = new Random();

        /* Populated the ArrayList with responses */
        responses.add("As I see it, yes.");
        responses.add("Ask again later.");
        responses.add("Better not tell you now.");
        responses.add("Cannot predict now.");
        responses.add("Concentrate and ask again.");
        responses.add("Don’t count on it.");
        responses.add("It is certain.");
        responses.add("It is decidedly so.");
        responses.add("Most likely.");
        responses.add("My reply is no.");
        responses.add("My sources say no.");
        responses.add("Outlook not so good.");
        responses.add("Outlook good.");
        responses.add("Reply hazy, try again.");
        responses.add("Signs point to yes.");
        responses.add("Very doubtful.");
        responses.add("Without a doubt.");
        responses.add("Yes.");
        responses.add("Yes – definitely.");
        responses.add("You may rely on it.");

        /* Clear the VSCode terminal, only tested with Linux based Boise State Budgie VM*/
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        /* Prompted user */
        System.out.println("Carefully consider the question to be asked... Press 'Enter' when ready.");
        kbd.nextLine();
        kbd.close();

        /* Randomly select a response from the responses array */
        System.out.println("You stare into the murky purple-ish darkness and your answer is revealed...");
        int answerIndex = rand.nextInt(responses.size());
        System.out.println(responses.get(answerIndex));

        
    }


    /**
     * Print the contents of the provided dataset in the console with one record per line
     * @param dataset ArrayList of String objects that make up the dataset to be displayed
     */
    public static void displayDataset(ArrayList<String> dataset)
    {
        for (String item: dataset)
        {
            System.out.println(item);
        }
    }

    /**
     * Generate a String containing the contents of the dataset as comma separated values
     * @param dataset ArrayList of String objects that make up the dataset
     * @return String containing the contents of the dataset as comma separated values
     */
    public static String DatasetToString(ArrayList<String> dataset)
    {
        String output = "";
        for (String item: dataset)
        {
            output += item + ", ";
        }
        return output;
    }
}
