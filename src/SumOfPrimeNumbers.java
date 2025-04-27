public class SumOfPrimeNumbers {
    public static boolean pri(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int sumof(int n) {
        if (n < 2) return 0;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (pri(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int n=20;
        System.out.println(sumof(n));
    }
}
