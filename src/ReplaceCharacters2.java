public class ReplaceCharacters2 {
    public static String repl(String s,char ch1,char ch2){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch1) sb.append(ch2);
            else if(s.charAt(i)==ch2) sb.append(ch1);
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="apples";
        char ch1='a',ch2='p';
        System.out.println(repl(s,ch1,ch2));
    }
}
