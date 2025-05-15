public class MaxConsecutiveOnes {
    public static int maxc(int[] a){
        int maxCount=0,currCount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){ currCount++;
            maxCount=Math.max(maxCount,currCount);}
            else currCount=0;
        }
        return maxCount;
    }
    public static void main(String[] args){
        int[] a={1,1,0,1,1,1,1};
        System.out.print(maxc(a));
    }
}
