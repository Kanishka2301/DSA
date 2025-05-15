public class IntegerToRoman {
    public static String roman(int n){
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10, 9,   5,  4,  1};
        String[] symbols = {"M", "CM","D", "CD","C", "XC","L", "XL","X","IX","V","IV","I"};
        StringBuilder r=new StringBuilder();
        for(int i=0;i<values.length && n>0;i++){
            if(n>=values[i]){
                n-=values[i];
                r.append(symbols[i]);
            }
        }
        return r.toString();
    }
    public static void main(String[] args){
        int n=1994;
        System.out.print(roman(n));
    }
}
