import java.util.HashMap;
import java.util.Map;


/**
 * MergeHashMap
 */
public class MergeHashMap {

    public static void main(String[] args) {
        
        Map<String, Integer> midTerm = new HashMap<>();
        midTerm.put("History", 75);
        midTerm.put("Maths", 50);
        System.out.println("Mid Term Scores " + midTerm);
        Map<String, Integer> finalTerm = new HashMap<>();
        finalTerm.put("Computer Science", 80);
        finalTerm.put("Maths", 80);
        finalTerm.put("English", 75);
        System.out.println("Final Term Scores " + finalTerm);
    }
}