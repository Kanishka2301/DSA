import java.util.*;
public class CheckSubsequence {
    public static int check(String a,String b){
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                if(i==a.length()) return 1;
            }
            j++;
        }
        return 0;
    }
    public static void main(String[] args){
        String a="AXY";
        String b="YADXP";
        System.out.println(check(a,b));
    }
}
