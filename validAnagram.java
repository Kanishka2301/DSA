//s="anagram" t="nagaram"
import java.util.*;
 class solution {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
    }
    for(int c:count){
        if(c!=0) return false;
    }
    return true;
    }
    public static void main(String[] args){
        solution so=new solution();
        String s="anagram";
        String t="nagaram";
        System.out.println(so.isAnagram(s,t));
    }
}
