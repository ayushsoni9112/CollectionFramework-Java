//13. How do you remove all even numbers from a `List`?  

import java.util.ArrayList;
import java.util.List;

public class ListQu5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 20; i++) {
            list.add(i);
        }
        System.out.println("List: " + list);
        list.removeIf(i -> i%2==0);
        // letuscodeit
        System.out.println("After remove: " + list);
    }
}
