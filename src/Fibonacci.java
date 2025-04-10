import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter numbers");
        int n=sc.nextInt();
        int first=0,second=1,next;
        for(int i=0;i<=n;i++){
            System.out.println(first+ " ");
            next=second+first;
            first=second;
            second=next;
        }

    }
}
