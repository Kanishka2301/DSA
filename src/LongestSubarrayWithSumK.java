public class LongestSubarrayWithSumK {
    public static int lon(int[] a,int k){
        int n=a.length,maxLen=0;
        long currSum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {
                currSum += a[i];
                if (currSum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] a={1,2,3,1,1,1,1};
        int k=3;
        System.out.print(lon(a,k));
    }
}
