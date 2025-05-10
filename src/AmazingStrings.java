//Given 3 strings,3rd string contains all characters of string 1 and string 2
public class AmazingStrings {
    public static void ans(String s1, String s2, String s3) {
        int[] freq1 = new int[128];
        int[] freq2 = new int[128];
        int[] freq3 = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i)]++;
        }
        for (int i = 0; i < s3.length(); i++) {
            freq3[s3.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            if (freq3[i] < freq1[i] + freq2[i]) {
                System.out.print("no");
                return;
            }
        }
        System.out.print("yes");
    }
    public static void main(String[] args) {
        String s1 = "kani";
        String s2 = "shka";
        String s3 = "kanishka";
        ans(s1, s2, s3);
    }
}
