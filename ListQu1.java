//4. How can you check if a `List` contains a specific element?  

import java.util.ArrayList;
import java.util.List;

public class ListQu1 {
    public static void main(String[] args) {
        System.out.println("letuscodeit");
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add("World");
        l1.add("999");
        if (l1.contains(999)) {
            System.out.println("value is present");
        } else {
            System.out.println("value is not present");
        }
    }
}
