//*
//**
//***
//**
//*
public class Pattern5 {
    public static void pat(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int stars = row <= n ? row : 2 * n - row;
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        pat(n);
    }
}
