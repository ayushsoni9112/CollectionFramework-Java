//5. Write code to sort a `List` in ascending order.  

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListQu2 {
    public static void main(String[] args) {
       List<Integer> l = new ArrayList<Integer>();
       l.add(12);
       l.add(32);
       l.add(1);
       l.add(99);
       l.add(60);
       System.out.println("Before Sorting  " + l);
    //    Collections.sort(l);
    sort(l);
       //letuscodeit
       System.out.println("After Sorting  " + l);
    }
    public static void sort(List<Integer> l) {
        int n = l.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (l.get(j) > l.get(j+1)) {
                    int temp = l.get(j);
                    l.set(j, l.get(j+1));
                    l.set(j+1, temp);
                }
            }
        }
    }
}
