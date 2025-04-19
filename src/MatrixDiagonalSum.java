public class MatrixDiagonalSum {
    public static int dia(int[][] a){
        int n=a.length,sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i][i];
            if(i!= n-1-i){
                sum=sum+a[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(dia(a));
    }
}
