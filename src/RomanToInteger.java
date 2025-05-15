import java.util.HashMap;

public class RomanToInteger {
    public static int find(String s){
        HashMap<Character,Integer> m=new HashMap<>();
        int total=0,prevValue=0;
        m.put('I',1);m.put('V',5);m.put('X',10);m.put('L',50);m.put('C',100);m.put('D',500);m.put('M',1000);
        for(int i=s.length()-1;i>=0;i--){
            int currValue=m.get(s.charAt(i));
            if(currValue<prevValue) total-=currValue;
            else total+=currValue;
            prevValue=currValue;
        }
        return total;
    }
    public static void main(String[] args){
        String s="MCMXCIV";
        System.out.print(find(s));
    }
}
