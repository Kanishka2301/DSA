import java.util.*;

public class BooleanMatrix {
    public static void bool(int[][] m){
        int rows=m.length,cols=m[0].length;
        boolean[] rm=new boolean[rows];
        boolean[] cm=new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(m[i][j]==1){
                    rm[i]=true;
                    cm[j]=true;
                }
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                 if(rm[i] || cm[j]){
                     m[i][j]=1;
                 }
            }
        }
    }
    public static void main(String[] args){
        int[][] m={{1,0},{0,0}};
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}
