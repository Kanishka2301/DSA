public class Factorial {
    public static int fact(int n){
        if(n==0) return 1;
        else return  (n*fact(n-1));
    }
    public static void main(String[] args){
        int n=4,fact=1;
        System.out.println(fact(n));
    }
}
