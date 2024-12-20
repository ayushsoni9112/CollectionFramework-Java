//3. Write a program to iterate over a `HashSet` using an `Iterator`.  

import java.util.HashSet;
import java.util.Iterator;

public class HashSetQu1 {
    public static void main(String[] args) {
        System.out.println("letuscodeit");
        HashSet<String> h = new HashSet<>();
        h.add("Hello");
        h.add("World");
        h.add("Hay");
        h.add("What");
        h.add("done");
        Iterator<String> itr = h.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }
        System.out.println("Completed!");
    }
}
