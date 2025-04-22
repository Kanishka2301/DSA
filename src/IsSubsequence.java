public class IsSubsequence {
    public static boolean isSub(String s,String t){
        int i=0,j=0;
        while(i<s.length() && i<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
    public static void main(String[] args){
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSub(s,t));
    }
}
