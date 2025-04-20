public class MaximumSubarraySum {
    public static long maxsub(int[] a){
        long sp=0,ep=0;
        for(int i=0;i<a.length;i++){
            sp+=a[i];
            if(sp<0) sp=0;
            ep=Math.max(ep,sp);
        }
        return sp;
    }
    public static void main(String[] args){
        int[] a={5,4,1,7,8};
        System.out.println(maxsub(a));
    }
}
