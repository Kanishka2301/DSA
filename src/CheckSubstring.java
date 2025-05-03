public class CheckSubstring {
    public static int sub(String s1,String s2){
        int in=s1.indexOf(s2);
        return in!=-1? in:-1;
    }
    public static void main(String[] args){
        String s1="hello world";
        String s2="world";
        System.out.println(sub(s1,s2));
    }
}
