//2. How do you remove an element from a `LinkedList` by index?  

import java.util.LinkedList;

public class LinkedListQu1 {
    public static void main(String[] args) {
        System.out.println("letuscodeit");
        LinkedList l = new LinkedList();
        l.add(12);
        l.add("Hello");
        l.add(true);
        l.add("12.44");
        System.out.println("Before remove: " + l);
        l.remove(2);
        System.out.println("after remove: " + l);
    }
}
