public class IndexOfFirstOccurenceInString {
    public static int index(String s1,String s2){
        if(s2.isEmpty()) return 0;
        for(int i=0;i<=s1.length()-s2.length();i++){
            if(s1.substring(i,i+s2.length()).equals(s2)) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        String s1="sadbutsad";
        String s2="sad";
        System.out.println(index(s1,s2));
    }
}
