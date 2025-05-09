//a   e
// b d
//  c
// b d
//a   e
public class Pattern12 {
    public static void main(String[] args){
        String input="abcde";
        int n=input.length();
        if(n%2!=0){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j || i+j==n-1){
                        System.out.print(input.charAt(j)+" ");
                    }
                  else   System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
