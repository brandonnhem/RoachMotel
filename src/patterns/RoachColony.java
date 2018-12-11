package patterns;

/**
 * 
 * @author Jamil Khan
 * @author Brandon Nhem
 * @author Anthony Pham
 * @author Brandon Walker
 * Purpose: 
 * Input:
 * Output:
 *
 */

import java.util.*;

public class RoachColony implements Observer {

    private String name;
    private double currentPop;
    private final int initPop;
    private double growthRate;

    public RoachColony() {
        name = "";
        initPop = 0;
        growthRate = 0;
    }

    public RoachColony(String name, int initial, double growthRate) {
        this.name = name;
        this.initPop = initial;
        this.currentPop = initial;
        this.growthRate = growthRate;
    }

    public String getName() {
        return name;
    }

    /**
     * The party method will at first increase the population of the RoachColony,
     * but then it will decrease more if they have no shower, but not as much
     * if they do have a shower.
     * @param amenities - Amenities that the RoachColony has
     */
    public void party(ArrayList<String> amenities) {
        System.out.print(getName() + " is throwing a party. ");
        currentPop = initPop + (initPop * growthRate);
        if (amenities.contains("Shower")) {
        	System.out.println("Good thing " + getName() + " has a shower!");
            currentPop *= 0.75;
        } 
        else 
        {
        	System.out.println("Too bad " + getName() + " did not have a shower!");
            currentPop *= 0.5;
        }
    }
    
    public int getInitPop() {
        return initPop;
    }
    
    /**
     * Update method notifies the RoachColony with a print statement in the main tester class.
     */
    public void update(String mname) {
        System.out.print("The " + name + " colony has received the notification from " + mname + ".\n");
    }

    public String toString() {
    	String s = String.format("Name: %-10s || Population: %d || Growth Rate %.2f", name, (int) currentPop, growthRate);
    	return s;
    }
}

