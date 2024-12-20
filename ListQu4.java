//9. How can you convert a `List` to an array?  

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListQu4 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(22);
        l.add(33);
        l.add(44);
        l.add(55);
        System.out.println("List: " + l);
        //letuscodeit
        int[] arr = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
