public class MaximumSubarray {
    public static int maxi(int[] n){
        int csum=0,maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            int temp = csum + n[i];
            if (temp < n[i]) {
                csum = n[i];
            } else {
                csum = temp;
            }
            if (csum > maxsum) {
                maxsum = csum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] n={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxi(n));
    }
}
