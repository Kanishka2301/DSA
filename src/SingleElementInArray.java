public class SingleElementInArray {
    public static int sin(int[] a){
        int left=0,right=a.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(a[mid]==a[mid^1])  left=mid+1;
            else right=mid;
        }
        return a[left];
    }
    public static void main(String[] args){
        int[] a={1,1,2,3,3,4,4};
        System.out.print(sin(a));
    }
}
