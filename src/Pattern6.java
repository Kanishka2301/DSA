//  *
// * *
//* * *
// * *
//  *
public class Pattern6 {
    public static void pat(int n){
        int size = 2 * n - 1;
        for (int row = 0; row < size; row++) {
            int stars = row < n ? row + 1 : size - row;
            int spaces = n - stars;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < stars; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        pat(n);
    }
}
