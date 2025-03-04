/**
 * Demonstrate using ArrayList objects with loops
 * @author Luke Hindman
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyLoopyRainbow {
    public static void main(String[] args) 
    {

		//Declare and instantiate an ArrayList of Color objects
		ArrayList<Color> rainbow = new ArrayList<Color>();
		//Use a for loop with a random number generator to add 100 items
		Random generator = new Random();
		
		for (int i = 0; i < 100; i++) {
			int r,g,b;
			r = generator.nextInt(256);
			g = generator.nextInt(256);
			b = generator.nextInt(256);
			Color randColor = new Color(r,g,b);
			rainbow.add(randColor);
		}
		
		//Use a for loop to display the contents
		for (int i = 0; i < rainbow.size(); i++) {
			System.out.println(rainbow.get(i));;
		}
		
		//Use a for-each loop to display the contents
		for (Color c: rainbow) {
			System.out.println(c);
		}
		
		//Use a while loop and Iterator to display the contents
		Iterator<Color> it = rainbow.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
    }
}
