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
    	 */
    	
    	// ---------------- ROACH COLONY SECTION --------------------
    	
    	RoachColony rc1  = new RoachColony("1st Colony", 50, .05);
    	RoachColony rc2  = new RoachColony("2nd Colony", 40, .06);
    	RoachColony rc3  = new RoachColony("3rd Colony", 30, .07);
    	RoachColony rc4  = new RoachColony("4th Colony", 60, .08);
    	RoachColony rc5  = new RoachColony("5th Colony", 70, .09);
    	RoachColony rc6  = new RoachColony("6th Colony", 80, .10);
    	RoachColony rc7  = new RoachColony("7th Colony", 90, .11);
    	RoachColony rc8  = new RoachColony("8th Colony", 100, .12);
    	RoachColony rc9  = new RoachColony("9th Colony", 120, .13);
    	RoachColony rc10 = new RoachColony("10th Colony", 140, .14);
    	
    	// --------------- AMENITIES SECTION --------------------
    	// Four different types of amenity lists, only one has the shower
    	
    	ArrayList<String> amenAll = new ArrayList<>();
    	ArrayList<String> amen1 = new ArrayList<>();
    	ArrayList<String> amen2 = new ArrayList<>();
    	ArrayList<String> amen3 = new ArrayList<>();
    	
    	amenAll.add("Shower");
    	amenAll.add("Spa");
    	amenAll.add("FoodBar");
    	amenAll.add("RefillBar");
    	
    	amen1.add("Spa");
    	
    	amen2.add("Spa");
    	amen2.add("FoodBar");
    	
    	amen3.add("Spa");
    	amen3.add("FoodBar");
    	amen3.add("RefillBar");
    	
    	// -------------------- ROACH MOTEL SECTION ----------------------
    	
    	System.out.println("Creating Motel Room \n");
    	
    	RoachMotel rm = RoachMotel.getInstance();
    	rm.setName("The Last Resort");
    	
    	rm.createRooms();
    	
    	System.out.println(rm + "\n");
    	
    	// ------------------- MOTEL ROOM SECTION ------------------------
    	
    	MotelRoom mr1  = rm.checkIn(rc1, "Basic", amenAll);
    	MotelRoom mr2  = rm.checkIn(rc2, "Deluxe", amen1);
    	MotelRoom mr3  = rm.checkIn(rc3, "Suite", amen2);
    	MotelRoom mr4  = rm.checkIn(rc4, "Basic", amen3);
    	MotelRoom mr5  = rm.checkIn(rc5, "Deluxe", amenAll);
    	
    	System.out.println("\nRoach Colonies that are added to waitlist as there is no vacancy.\n");
    	
    	MotelRoom mr6  = rm.checkIn(rc6, "Suite", amen1);
    	
    	System.out.println();
    	
    	MotelRoom mr7  = rm.checkIn(rc7, "Basic", amen2);
    	
    	System.out.println();

    	MotelRoom mr8  = rm.checkIn(rc8, "Deluxe", amen3);
    	
    	System.out.println();

    	MotelRoom mr9  = rm.checkIn(rc9, "Suite", amenAll);
    	
    	System.out.println();

    	MotelRoom mr10 = rm.checkIn(rc10, "Basic", amen1);
    	
    	System.out.println();
    	
    	System.out.println(rm + "\n");
    	
    	// ------------------ PARTY SECTION ----------------
    	
    	rc1.party(amenAll);
    	rc2.party(amen1);
    	rc3.party(amen2);
    	rc4.party(amen3);
    	rc5.party(amenAll);
    	
    	System.out.println();
    	
    	// ----------------- CHECK OUT SECTION -------------
    	
    	Double cost = rm.checkOut(mr1, 7);
    	
    	System.out.println("Cost: $" + cost);
    	
    	System.out.println();
    	
    	mr6 = rm.checkIn(rc6, "Suite", amenAll);
    	
    	cost = rm.checkOut(mr2, 8);
    	
    	System.out.println("Cost: $" + cost);
    	
    	System.out.println();
    	
    	mr7 = rm.checkIn(rc7, "Basic", amen1);
    	
    	cost = rm.checkOut(mr3, 9);
    	
    	System.out.println("Cost: $" + cost);
    	
    	System.out.println();
    	
    	mr8 = rm.checkIn(rc8, "Deluxe", amen2);
    	
    	cost = rm.checkOut(mr4, 10);
    	
    	System.out.println("Cost: $" + cost);
    	
    	System.out.println();
    	
    	mr9 = rm.checkIn(rc9, "Suite", amen3);
    	
    	cost = rm.checkOut(mr5, 11);
    	
    	System.out.println("Cost: $" + cost);
    	
    	mr10 = rm.checkIn(rc10, "Basic", amenAll);
    	
    }

}