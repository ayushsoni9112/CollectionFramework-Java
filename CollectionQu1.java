//7. Implement a program to copy all elements from one collection to another.  

import java.util.ArrayList;
import java.util.Collection;

public class CollectionQu1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(12);
        c.add(23);
        c.add(66);
        c.add(88);
        c.add(22);
        System.out.println("First Collection: " + c);
        Collection c2 = new ArrayList();
        c2.addAll(c);
        System.out.println("Second collection: " + c2);
    }
}
