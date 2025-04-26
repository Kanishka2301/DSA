public class PowerOf2 {
    public static boolean ipow(int n){
        if(n<1) return false;
      else   if(n==1) return true;
       else{
           while(n%2==0){
               n=n/2;
           }
           if(n==1) return true;
           else return false;
        }
    }
    public static void main(String[] args){
        int n=1;
       System.out.println(ipow(n));
    }
}
