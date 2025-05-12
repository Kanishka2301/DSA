public class MissingAndRepeatingNumbers {
    public static int[] mp(int[][] m){
        int n=m.length,rep=0,miss=0;
        int[] a=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[m[i][j]-1]++;
            }
        }
        for(int i=0;i<n*n;i++){
            if(a[i]==0) miss=i+1;
            else if(a[i]==2) rep=i+1;
        }
        return new int[]{rep,miss};
    }
    public static void main(String[] args){
        int[][] m={{1,3},{2,2}};
        int[] res=mp(m);
        for(int num: res) {
            System.out.print(num+" ");
        }
    }
}
