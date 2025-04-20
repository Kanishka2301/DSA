public class MissingNumberInArray {
    public static int missno(int[] a){
        int n=a.length+1,expectedSum=n*(n+1)/2,actualSum=0;
        for(int num:a){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args){
        int[] a={1,2,3,5};
        System.out.println(missno(a));
    }
}
