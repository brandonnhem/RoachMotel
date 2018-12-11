package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* December 12, 2018
* Purpose: amenity added to Motel Room amenities
* Input: n/a
* Output: Description and cost
*
*/

public class Spa extends AmenitiesDecorator{
    MotelRoom mr;
    
    public Spa(MotelRoom Mroom) {
        mr = Mroom;
    }
    
    public String getDescription() {
        return mr.getDescription() + ", Spa";
    }
    
    public double getCost() {
        return 20 + mr.getCost();
    }

}