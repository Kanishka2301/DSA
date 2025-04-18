import java.util.Stack;

public class ValidParenthesis2 {
    public static boolean valid(String s){
        Stack<Character> st=new Stack<>();
        Stack<Character> starst=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push(ch);
             else if (ch == '*') starst.push(ch);
             else if(!st.isEmpty()) st.pop();
            else if(!starst.isEmpty()) starst.pop();
            else return false;
        }
        while(!st.isEmpty() && !starst.isEmpty()){
            if(st.peek()<starst.peek()) {
                st.pop();
                starst.pop();
            }
            return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        String s="(*)";
        System.out.println(valid(s));
    }
}
