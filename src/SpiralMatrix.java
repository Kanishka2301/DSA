import java.util.*;

public class SpiralMatrix {
    public List<Integer> spi(int[][] m) {
        List<Integer> res = new ArrayList<>();
        if (m == null || m.length == 0) return res;
        int rowBegin = 0, rowEnd = m.length - 1;
        int colBegin = 0, colEnd = m[0].length - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                res.add(m[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(m[i][colEnd]);
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    res.add(m[rowEnd][i]);
                }
                rowEnd--;
            }
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(m[i][colBegin]);
                }
                colBegin++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> result = spiralMatrix.spi(m);
        System.out.println(result);
    }
}