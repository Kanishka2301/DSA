import java.util.ArrayList;

public class RearrangeBySign {
    public static int[] re(int[] a) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int num : a) {
            if (num > 0) pos.add(num);
            else neg.add(num);
        }
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && !pos.isEmpty()) {
                a[i] = pos.remove(0);
            } else if (!neg.isEmpty()) {
                a[i] = neg.remove(0);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -4, -5};
        int[] res = re(a);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}