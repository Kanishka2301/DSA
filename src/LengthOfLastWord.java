public class LengthOfLastWord {
    public static int dem(String s){
        s=s.trim();
        int last=s.lastIndexOf(' ');
        return s.length()-last-1;
    }
    public static void main(String[] args){
        String s="Hello World";
        System.out.println(dem(s));
    }
}
