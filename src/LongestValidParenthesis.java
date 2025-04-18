import java.util.*;

public class LongestValidParenthesis {
    public static int valid(String s){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - st.peek());
                }
            }
        }

        return maxLength;
    }
    public static void main(String[] args){
        String s="(()";
        System.out.println(valid(s));
    }

}
