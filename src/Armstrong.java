import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        int arm=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        while(n>0){
            int digit=n%10;
            n=n/10;
            arm=arm+digit*digit;
        }
        if(arm==n){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
