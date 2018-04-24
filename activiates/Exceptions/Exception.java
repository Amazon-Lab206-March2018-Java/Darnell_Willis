/**
 * Exception
 */
import java.util.ArrayList;

public class Exception {

    public static void main(String[] args) {
        
        ArrayList<Object> myLists = new ArrayList<Object>();
            myLists.add("13");
            myLists.add("hello world");
            myLists.add(48);
            myLists.add("Goodbye World");

        for (Object myList : myLists) {
            try {
                Integer castedValue = (Integer) myList; 
                System.out.println(castedValue);
            } catch (ClassCastException e) {
                System.out.println("ERROR ON INDEX " +  myLists.indexOf(myList));
            }
        }    

    }
}