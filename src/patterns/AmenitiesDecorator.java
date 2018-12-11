package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* December 12, 2018
* Purpose: Interface which allows Decorator Pattern to be used on Motel Room objects
* Inputs: none required
* Outputs: none required
*
*/

public abstract class AmenitiesDecorator extends MotelRoom{
    public abstract String getDescription();
}