public class MaximumElementInArray {
    public static int maxele(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }
        return max;
    }
    public static void main(String[] args){
        int[] a={3,7,8,9};
        System.out.println(maxele(a));
    }
}
