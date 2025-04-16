import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(revwords(s));
    }
    public static String revwords(String s){
        List<String> words=new ArrayList<>();
        s=s.trim();
        String[] ch=s.split("\\s+");
        for(String word:ch){
            if(!word.isEmpty()){
                words.add(word);
            }
        }
        Collections.reverse(words);
        return String.join(" ",words);
    }
}

