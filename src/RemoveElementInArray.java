public class RemoveElementInArray {
    public static int rem(int[] n,int val){
        int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=val){
                n[count++]=n[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] n={3,2,2,3,2};
        int val=3;
        System.out.println(rem(n,val));
    }
}
