import java.util.HashSet;

public class Pangram {
    public static boolean pan(String s){
        HashSet<Character> al=new HashSet<>();
        for (char c : s.toLowerCase().toCharArray())
        {
            if(c>='a'&& c<='z'){
                al.add(c);
            }
        }
        return al.size()==26;
    }
    public static void main(String[] args){
        String s = "The five boxing wizards jump quickly";
        System.out.println(pan(s));
    }
}
