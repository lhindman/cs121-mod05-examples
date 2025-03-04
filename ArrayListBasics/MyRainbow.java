import java.awt.Color;
import java.util.ArrayList;

/**
 * In class example of how to create and work with an Array List
 * @author Luke Hindman
 *
 */
public class MyRainbow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declare and instantiate an ArrayList of Color objects
		ArrayList<Color> rainbow = new ArrayList<Color>();
		
		//Add ORANGE, YELLOW, and PINK
		rainbow.add(Color.ORANGE);
		rainbow.add(Color.YELLOW);
		rainbow.add(Color.PINK);
		
		//Display the number of items
		System.out.println("The rainbow contains " + rainbow.size() + " colors");
		
		//Display the contents using toString() 
		System.out.println(rainbow.toString());
		
		//Remove the first item
		rainbow.remove(0);
		
		//Display the number of items
		System.out.println("The rainbow contains " + rainbow.size() + " colors");
		
		//Display the contents using toString() 
		System.out.println(rainbow.toString());
		
		//Remove a specific item
		rainbow.remove(Color.YELLOW);
		
		//Display the number of items
		System.out.println("The rainbow contains " + rainbow.size() + " colors");
		
		//Display the contents using toString() 
		System.out.println(rainbow.toString());
		
		//Remove all items
		rainbow.clear();
		
		//Display the number of items
		System.out.println("The rainbow contains " + rainbow.size() + " colors");
	}
}
