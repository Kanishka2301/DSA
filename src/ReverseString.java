import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char ch;
        String revstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            revstr += ch;
        }
        System.out.println("Reversed string: " + revstr);
    }
}
