import java.util.HashMap;

public class CountCharacterOccurences {
    public static void main(String[] args){
        String s="aabbbc";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int count=map.get(ch);
                count++;
                map.replace(ch,count);
            }
            else map.put(ch,1);
        }
        for(char c:map.keySet()){
            System.out.print(c+""+map.get(c));
        }
    }
}
