import java.util.*;

public class SecondLargestDigitInString {
    public static int sec(String s){
        Set<Integer> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                set.add(Character.getNumericValue(ch));
            }
        }
        List<Integer> li=new ArrayList<>(set);
        Collections.sort(li);
        if(li.size()<2) return -1;
        int res=li.get(li.size()-2);
            return res;
    }
    public static void main(String[] args){
        String s="dfa12321afd";
        System.out.println(sec(s));
    }
}
