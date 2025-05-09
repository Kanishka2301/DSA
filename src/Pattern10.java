//****
// ***
//  **
//   *
public class Pattern10 {
    public static void pat(int n){
        for(int row=0;row<n;row++){
            for(int s=0;s<row;s++){
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        pat(n);
    }
}
