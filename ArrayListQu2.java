//12. Write code to find duplicates in an `ArrayList`.  

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListQu2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(12);
        l.add(14);
        l.add(16);
        l.add(12);
        System.out.println("List: " + l);
        // letuscodeit
        ArrayList<Integer> d = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for (Integer i : l) {
            if (!h.add(i)) {
                if (!d.contains(i)) {
                    d.add(i);
                }
            }
        }
        System.out.println("Duplicate are: " + d);
    }
}
