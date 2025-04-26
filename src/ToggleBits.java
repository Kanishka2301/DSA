public class ToggleBits {
    public static int tobit(int n){
        if(n==0) return 0;
        int msb=0,temp=n;
        while(temp>0){
            msb++;
            temp>>=1;
        }
        int mask=(1<<(msb-1)) -1;
        return n^mask;
    }
    public static void main(String[] args){
        int n=21;
        System.out.println(Integer.toBinaryString(n));
        int res=tobit(n);
        System.out.println(Integer.toBinaryString(res));
    }
}
