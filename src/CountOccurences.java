import java.util.*;

public class CountOccurences {
    public static void main(String[] args) {
        int[] a = {4, 5, 4, 4, 2, 1, 2, 1, 3};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }

            System.out.println(a[i] + ":" +count);
        }
    }
}
