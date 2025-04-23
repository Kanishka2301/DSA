public class ReplaceCharacters {
    public static String rep(String s,char ch1,char ch2){
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch1) res+=ch2;
            else if(s.charAt(i)==ch2) res+=ch1;
            else res+=s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args){
        String s="apples";
        char ch1='a',ch2='p';
        System.out.println(rep(s,ch1,ch2));
    }
}
