public class ReverseEachWord {
    public static void rev(String str){
        String[] words=str.split(" ");
        String revstr="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String nstr="";
            for(int j=0;j<word.length();j++){
               char ch=word.charAt(j);
               nstr=ch+nstr;
            }
            revstr=revstr+nstr+" ";
        }
        System.out.println(str);
        System.out.println(revstr);
    }
    public static void main(String[] args){
        rev("Java program");
    }
}
