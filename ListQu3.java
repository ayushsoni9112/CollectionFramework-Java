//8. Write a program to reverse a `List`.  

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQu3 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(22);
        l.add(33);
        l.add(55);
        l.add(66);
        System.out.println("letuscodeit");
        System.out.println("Before reverse: " + l);
        //first way

        // Collections.reverse(l);
        //second way
        reverse(l);
        System.out.println("After reverse: " + l);
        please subscribe
    }
    public static void reverse(List<Integer> l) {
        for(int i = 0; i < l.size() / 2; i++) {
            int temp = l.get(i);
            l.set(i, l.get(l.size() - 1 - i));
            l.set(l.size() - 1 - i, temp);
        }
    }
}