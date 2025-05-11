import java.util.Arrays;

public class SetMatrixZeros {
    public static void setzeros(int[][] mat){
        int n= mat.length,m=mat[0].length,colo=1;
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) {
                colo=0;
            }
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]!=0){
                    if(mat[i][0]==0 || mat[0][j]==0){
                        mat[i][j]=0;
                    }
                }
            }
        }
        if(mat[0][0]==0){
            for(int j=0;j<m;j++){
                mat[0][j]=0;
            }
        }
        if(colo==0) {
            for(int i=0;i<n;i++){
                mat[i][0]=0;
            }
        }
    }
    public static void main(String[] args){
        int[][] mat={{1,2,3},{4,0,6},{7,8,9}};
        setzeros(mat);
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
