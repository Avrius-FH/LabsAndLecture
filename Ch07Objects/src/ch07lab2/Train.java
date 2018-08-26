package ch07lab2;
import java.util.ArrayList;

/**
 * Class for a Train object that maintains a list of a train's freight cars and their contents.
 * 04/19/2018
 * @author Forrest Halterman
 * @author Randall Guidry
 */

public class Train {

    private ArrayList<String> trainContainers;     // list for the freight cars

    /**
     * Constructs a train with an empty list
     */

    public Train() {
        this (new ArrayList<>()) ;               // passes an empty list to construct train's log

    }

    /**
     * constructs a train by copying another list
     * @param containers the list to be copied into the object
     */

    public Train(ArrayList<String> containers) {
        this.trainContainers = new ArrayList<>();     // initializes the train's log

        //copies container array list into the train object's array list
         for (int i = 0; i < containers.size() ; i++) {
             this.trainContainers.add( containers.get(i)) ;
            }

    }

    /**
     * adds another container to the list of freight
     * @param contents the cargo to be added to the log of the train's freight list
     * @return returns true if the method executes successfully
     */

    public boolean addContainers (String contents) {
        this.trainContainers.add(contents) ;
        return true ;
    }

    /**
     * outputs a container and its freight to the main
     * @param index indicates what train car's contents to be fetched from the list/log
     * @return the selected train car's contents
     */
    public String getContainers (int index) {
        return index < 0 || index >= this.trainContainers.size() ? "" :
                this.trainContainers.get(index);
    }

    /**
     * replaces a car's contents with something new
     * @param index indicates what train car's freight to replace
     * @param newContents the new freight being loaded into the train's log
     * @return true or false depending on whether the index falls within the train's log range
     */

    public boolean setContainer (int index, String newContents) {

        if ( index < 0 || index >= this.trainContainers.size()) {
            return false;
        }
        else {
            this.trainContainers.set(index, newContents);
            return true;
        }

    }

    /**
     * outputs the size of the train's log to the main or calling class/method
     * @return the length of the train's list
     */

    public int length () {
        return this.trainContainers.size() ;
    }
}
