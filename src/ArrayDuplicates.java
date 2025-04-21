// elements that occur more than once
import java.util.*;

public class ArrayDuplicates {
    public static Integer[] demo(int[] a) {
        if (a == null || a.length < 2) {
            return null;
        }

        Arrays.sort(a);
        List<Integer> li = new ArrayList<>();

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i-1] && (li.isEmpty() || li.get(li.size()-1) != a[i])) {
                li.add(a[i]);
            }
        }

        if (li.isEmpty()) {
            return null;
        }

        return li.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 3};
        System.out.println(Arrays.toString(demo(a)));
    }
}