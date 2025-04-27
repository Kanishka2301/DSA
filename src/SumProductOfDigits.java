public class SumProductOfDigits {
    public static void main(String[] args){
        int n=73,sum=0,prod=1,rem;
        while(n>0){
            rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        System.out.println("sum:"+sum);
        System.out.println("prod:"+prod);
    }
}
