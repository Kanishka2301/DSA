import java.util.*;

public class FirstUniqueCharacterInString {
    public static int fi(String s){
        if(s==null || s.isEmpty()) return -1;
        HashMap<Character,Integer> ch=new HashMap<>();
        for (char c : s.toCharArray()) {
            ch.put(c, ch.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (ch.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
       String s="leetcode";
       System.out.println(fi(s));
    }
}
