import java.util.*;
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(substring(s));
    }

    public static int substring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}