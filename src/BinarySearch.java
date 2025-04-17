public class BinarySearch {
         public  static int binsea(int[] nums,int target){
             if(nums.length==0) return -1;
             int l=0,r=nums.length-1;
             while(l<=r){
                 int mid=l+(r-l)/2;
                 if(nums[mid]==target){
                     return mid;
                 }
                else if(nums[mid]>target){
                     r=mid-1;
                 }
                else{
                    l=mid+1;
                 }
             }
             return -1;
         }
         public  static void main(String[] args){
              int[] nums={-1,0,3,5,9,12};
              int target=9;
              System.out.println(binsea(nums,target));
         }
}
