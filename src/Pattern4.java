//1
//12
//123
//1234
public class Pattern4 {
    public static void pat(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        pat(n);
    }
}
