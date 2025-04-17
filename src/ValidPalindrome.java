public class ValidPalindrome {
    public static boolean vp(String s){
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="A man, a plan, a canal:Panama";
        System.out.println(vp(s));
    }
}
