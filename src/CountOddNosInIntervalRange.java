public class CountOddNosInIntervalRange {
    public static int c(int low,int high){
        int ch=(high+1)/2;
        int cl=low/2;
        return ch-cl;
    }
    public static void main(String[] args){
        int low=3,high=7;
        System.out.println(c(low,high));
    }
}
