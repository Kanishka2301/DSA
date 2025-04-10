import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
        }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
