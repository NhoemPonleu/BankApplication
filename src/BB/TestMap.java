package BB;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args)
    {
// Create a SortedMap.
        SortedMap<Integer, String> smap = new TreeMap<>();

// Adding entries in TreeMap.
        smap.put(10, "Ten");
        smap.put(20, "Twenty");
        smap.put(05, "Five");
        smap.put(07, "Seven");
        smap.put(40, "Forty");

        System.out.println("Entries in map: " +smap);

// Removing an entry.
        Object removeEntry = smap.remove(05);
        System.out.println("Removed entry: " +removeEntry);
        System.out.println("Updated entries in map after remove operation: " +smap);

    }
}
