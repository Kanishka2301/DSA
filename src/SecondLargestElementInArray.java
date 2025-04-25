public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] a = {10, 12, 13, 4, 5};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest element: " + a[1]);
    }
}
