import java.util.*;

public class RevWords {
    public static void rev(char[] s){
        reverse(s,0,s.length-1);
        int sp=0;
        for(int ep=0;ep<s.length;ep++){
            if(ep==s.length || s[ep]==' '){
                if(ep==s.length-1){
                    ep++;
                }
                reverse(s,sp,ep-1);
                sp=ep+1;
            }
        }
    }
    public static void reverse(char[] s,int sp,int ep){
        while(sp<ep){
            char temp=s[sp];
            s[sp]=s[ep];
            s[ep]=temp;
            sp++;
            ep--;
        }
    }


}
