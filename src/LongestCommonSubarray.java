import java.util.Arrays;

public class LongestCommonSubarray {
    public static String longe(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        int max = 0, end = -1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        end = i - 1;
                    }
                }
            }
        }
        if (max == 0) return "";
        return s1.substring(end - max + 1, end + 1);
    }
    public static void main(String[] args) {
        String s1 = "abcjklp";
        String s2 = "acjkp";
        String result = longe(s1, s2);
        System.out.println("Longest Common Substring: " + result);
    }
}