package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* December 12, 2018
* Purpose: Specific subclass of MotelRoom that adds its specific final cost of the rooms 
* Input: n/a 
* Output: returns the final cost of the room
*
*/

public class DeluxeRoom extends MotelRoom {

	private static final double COST = 75;
	
	public DeluxeRoom() {
		description = "Deluxe Room";
	}
	
	@Override
	public double getCost() {
		return COST;
	}

}