/**
 * MapHash
 */
import java.util.HashMap;

public class MapHash {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<>();
            trackList.put("Java", "This is a song about Java!");
            trackList.put("Python", "The hello ECMA Script");
            trackList.put("React", "facebook for the win");
            trackList.put("Coding Dojo", "coding is the best and there ain't no rest");

            String title = trackList.get("Java");
            System.out.println(title);

            trackList.forEach((k,v) -> System.out.println(k + ": " + v));
            
    }

}