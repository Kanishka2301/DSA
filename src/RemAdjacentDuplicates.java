import java.util.*;

public class RemAdjacentDuplicates {
    public static String rem(String s){
        Stack<Character> set=new Stack<>();
        for(char i : s.toCharArray()){
            if(set.isEmpty() || i!=set.peek()){
                set.push(i);
            }
            else{
                set.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char i:set){
            sb.append(i);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="abbaca";
        System.out.println(rem(s));
    }
}
