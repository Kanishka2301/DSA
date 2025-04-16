import java.util.*;
public class ReverseEachWord {
    public static String rev(String s){
       char[] ch=s.toCharArray();
       int len=ch.length,sp=0;
       for(int ep=0;ep<len;ep++){
           if(ep==len || ch[ep]==' '){
               reverse(ch,sp,ep-1);
               sp=ep+1;
           }
       }
       return new String(ch);
    }
    public static void reverse(char[] ch,int sp,int ep){
        while(sp<ep){
            char temp=ch[sp];
            ch[sp]=ch[ep];
            ch[ep]=temp;
            sp++;
            ep--;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(rev(s));
}
}
