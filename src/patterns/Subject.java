package patterns;

/**
*
* @author Jamil Khan, Brandon Nhem, Anthony Pham, Brandon Walker
* December 12, 2018
* Purpose: The Subject interface is meant for the RoachMotel and adds multiple Observers from the Observer 
* Input: addObserver(), removeObserver()
* Output: n/a
*
*/

public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}