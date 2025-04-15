import java.util.*;

public class MoveZeroesAtEnd {
    public static void main(String[] args) {
        int[] n = {0, 1, 0, 3, 12};
        movezeroes(n);
        System.out.println(Arrays.toString(n));
    }
    public static void movezeroes(int[] n) {
        int count = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 0) {
                n[count++] = n[i];
            }
        }
        while (count < n.length) {
            n[count++] = 0;
        }
    }
}
