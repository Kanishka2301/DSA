public class CountCharacterOccurrences2 {
        public static void main(String[] args){
            String s="a1b10";
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(Character.isAlphabetic(ch)){
                    System.out.print(ch);
                }
                else{
                    StringBuilder sb=new StringBuilder();
                    while(i<s.length() && Character.isDigit(ch)){
                        sb.append(ch);
                        i++;
                        if (i < s.length()) ch = s.charAt(i);
                    }
                    int c=Integer.parseInt(sb.toString());
                    for(int j=1;j<c;j++){
                        System.out.print(s.charAt(i-sb.length()-1));
                    }
                }
            }
        }
}
