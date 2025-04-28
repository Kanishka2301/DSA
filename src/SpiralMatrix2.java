import java.util.Arrays;

public class SpiralMatrix2 {
    public int[][] spiralMatrix(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows * cols][2];
        int index = 0;
        int[] dr = {0, 1, 0, -1};  // Direction changes for rows
        int[] dc = {1, 0, -1, 0};  // Direction changes for columns
        int direction = 0;          // Start moving right
        int steps = 1;
        int r = rStart, c = cStart;

        res[index++] = new int[]{r, c};

        while (index < rows * cols) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < steps; j++) {
                    r += dr[direction];
                    c += dc[direction];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        res[index++] = new int[]{r, c};
                        if (index == rows * cols) return res;
                    }
                }
                direction = (direction + 1) % 4;
            }
            steps++;
        }
        return res;
    }

    public static void main(String[] args) {
        int rows = 1, cols = 4, rStart = 0, cStart = 0;
        SpiralMatrix2 sm = new SpiralMatrix2();
        int[][] result = sm.spiralMatrix(rows, cols, rStart, cStart);

        // Format the output exactly as requested
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(Arrays.toString(result[i]));
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}