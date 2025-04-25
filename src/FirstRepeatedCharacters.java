import java.util.*;
public class FirstRepeatedCharacters {
    public static String first(String s){
        char ele=0;
        String b="";
        ArrayList<Character>  a=new ArrayList<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++) {
            if (!a.contains(ch[i])) a.add(ch[i]);
            else{
                ele=ch[i];
                b+=ch[i];
                return b;
            }
        }
        return "-1";
    }
    public static void main(String[] args){
        String s="kanishka";
        System.out.println(first(s));
    }
}
