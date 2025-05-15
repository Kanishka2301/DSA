import java.util.*;
public class SearchPattern {
    public static List<Integer> findPattern(String text, String pattern) {
        List<Integer> indexes = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                indexes.add(i + 1);
            }
        }
        return indexes;
    }
    public static void main(String[] args){
        String text = "batmanandrobinarebat";
        String pattern = "bat";
        List<Integer> indexes = findPattern(text, pattern);
        for (int index : indexes) {
            System.out.print(index + " ");
        }
    }
}
