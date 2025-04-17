import java.util.Stack;

public class RemAdjacentDupicates2 {
    public static String rem(String s,int k){
        Stack<Character> charac=new Stack<>();
        Stack<Integer> count=new Stack<>();
        for(char ch:s.toCharArray()) {
            if (!charac.isEmpty() && charac.peek()==ch){
                count.push(count.pop()+1);
            }
            else{
                charac.push(ch);
                count.push(1);
            }
            if(count.peek()==k){
                charac.pop();
                count.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        if(!charac.isEmpty()){
            char ch=charac.pop();
            int c=count.pop();
            for(int i=0;i<c;i++){
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String s="deeedbbcccbdaa";
        int k=3;
        System.out.println(rem(s,k));
    }
}
