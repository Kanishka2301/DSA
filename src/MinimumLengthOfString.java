public class MinimumLengthOfString {
    public static int minl(String s){
        int[] cfreq=new int[26];
        int minlength=0;
        for(char c:s.toCharArray()){
            cfreq[c-'a']++;
        }
        for(int freq:cfreq){
            if(freq==0) continue;
            if(freq%2==0) minlength+=2;
            else minlength+=1;
        }
        return minlength;
    }
    public static void main(String[] args){
        String s="abaacbcbb";
        System.out.println(minl(s));
    }
}
