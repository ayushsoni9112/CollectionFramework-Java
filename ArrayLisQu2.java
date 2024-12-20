//10. Write a program to merge two `ArrayList` objects.

import java.util.ArrayList;

public class ArrayLisQu2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(22);
        l.add(33);
        l.add(44);
        l.add(55);
        l.add(66);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(116);
        //letuscodeit
        System.out.println("First List: "+l);
        System.out.println("Second List: " + l2);
        l2.addAll(3, l);
        System.out.println("Merged List: " + l2);
    }
}
