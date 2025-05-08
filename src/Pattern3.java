//****
//***
//**
//*
public class Pattern3 {
    public static void pat(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
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
