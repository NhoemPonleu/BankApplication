package BB;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args)
    {
// Create a SortedMap.
        SortedMap<Integer, String> smap = new TreeMap<Integer,String>();

// Adding entries in TreeMap.
        smap.put(90, "John");
        smap.put(85, "Deep");
        smap.put(100, "hia");
        smap.put(35, "Olivea");
        smap.put(39, "Shubh");

        System.out.println("Marks in maths: " +smap);
        System.out.println("Students that passed maths exam: " +smap.tailMap(40));
        System.out.println("Students that failed in maths exam: " +smap.headMap(40));

        System.out.println("Lowest marks: " +smap.firstKey());
        System.out.println("Highest marks: " +smap.lastKey());
    }
}
