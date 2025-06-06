public class RotateMatrixInClockWise {
    public static void  mat(int[][] matrix){
        int n= matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-i];
                matrix[i][n-1-i]=temp;
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        mat(matrix);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
