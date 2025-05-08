//****
//****
//****
//****
public class Pattern2 {
    public static void pat2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        pat2(4);
    }
}
