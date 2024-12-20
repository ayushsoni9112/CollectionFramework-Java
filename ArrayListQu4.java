//19. How do you find the maximum value in an `ArrayList`?  

import java.util.ArrayList;

public class ArrayListQu4 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(67);
        l.add(54);
        l.add(89);
        l.add(99);
        l.add(78);
        l.add(54);
        l.add(12);
        System.out.println("List: " + l);
        int max = l.get(0);
        for (Integer i : l) {
            if (i > max) {
                max = i;
            }
        }
        //letuscodeit
        System.out.println("max value is: " + max);
    }
}
