//Duplicate array in N+1 integers
public class DuplicateArray {
    public static int dup(int[] a){
        int n=a.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            if(freq[a[i]]==0){
                freq[a[i]]+=1;
            }
            else return a[i];
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a={1,3,4,2,2};
        System.out.print(dup(a));
    }
}
