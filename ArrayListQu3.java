//12. Write code to find duplicates in an `ArrayList`.  

import java.util.ArrayList;

public class ArrayListQu3 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(16);
        l.add(12);
        l.add(14);
        l.add(16);
        l.add(15);
        l.add(18);
        l.add(12);
        System.out.println("List: " + l);
        // letuscodeit
        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 0; i < l.size() - 1; i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    if (!d.contains(l.get(j))) {
                        d.add(l.get(j));
                    }
                }
            }
        }
        System.out.println("Duplicate: " + d);
    }
}
