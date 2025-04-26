public class CountCharactersVowelsConsonants {
    public static void main(String[] args) {
        String s = "Hello Kanishka23";
        int count = 0, vcount = 0, ccount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vcount++;
                } else {
                    ccount++;
                }
            }
        }

        System.out.println("Total letters: " + count);
        System.out.println("Vowels: " + vcount);
        System.out.println("Consonants: " + ccount);
    }
}