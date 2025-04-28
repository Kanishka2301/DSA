import java.util.*;

public class SpiralMatrix1 {
    public static int[][] spi(int n) {
        int[][] m=new int[n][n];
        int value=1;
        int rowBegin = 0, rowEnd = m.length - 1;
        int colBegin = 0, colEnd = m[0].length - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                m[rowBegin][i]=value++;
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
               m[i][colEnd]=value++;
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                   m[rowEnd][i]=value++;
                }
                rowEnd--;
            }
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    m[i][colBegin]=value++;
                }
                colBegin++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
      int n=3;
      int[][] spiral=spi(n);
        for (int[] row : spiral) {
            System.out.println(Arrays.toString(row));
        }
    }
}