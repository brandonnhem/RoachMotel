package patterns;

import java.util.*;
public class RoachMotelTester {

    public static void main(String[] args) {
    	/**
    	 * CHECKLIST:
    	 * - Singleton Pattern
    	 * - Decorate Pattern
    	 * - Factory Pattern
    	 * - Observer Pattern
    	 * - Create a RoachColony
    	 * - Print a RoachColony
    	 * - Have a RoachColony party WITH shower
    	 * - Have a RoachColony party without shower
    	 * - Create MotelRoom 
    	 * - Create 3 different types of rooms
    	 * - Print all the rooms!
    	 * - Create a RoachMotel
    	 * - Check in a RoachColony from Motel
    	 * - Check out a RoachColony from Motel
    	 * - Print a RoachMotel
    	 * -
    	 * -
    	 * -
    	 * -
    	 */
    	RoachColony rc = new RoachColony("1st Colony", 10,50.0);
    	RoachMotel rm = RoachMotel.getInstance();
    	rm.createRooms();
    	rm.setName("Super Mega Hut Weenie Jr.");
    	System.out.println(rm);
    	ArrayList amen = new ArrayList();
//    	amen.add("Shower");
    	amen.add("FoodBar");
    	amen.add("Spa");
    	amen.add("RefillBar");
    	MotelRoom mr = rm.checkIn(rc, "Deluxe", amen);
    	System.out.println(mr);
    	rc.party(amen);
    	System.out.println(rc);
    	RoachColony rc2 = new RoachColony("2nd Colony", 15, 3.0);
    	MotelRoom mr2 = rm.checkIn(rc2, "Suite", amen);
    	RoachColony rc3 = new RoachColony("3rd Colony", 15, 3.0);
    	MotelRoom mr3 = rm.checkIn(rc3, "Basic", amen);
    	System.out.println(rm);
    	
    	
    }

}