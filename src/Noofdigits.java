import java.util.Scanner;
public class Noofdigits {
    public static void main(String[] args){
        int n=0,a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
            if(n<0){
               n=n*-1;
            }
            else if(n==0){
                n=1;
        }
            while(n>0){
                n=n/10;
                a++;
            }
            System.out.println("no of digits"+a);
    }
}
