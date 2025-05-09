//___1
//__232
//_34543
//4567654
public class Pattern11 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            int nums=i;
            for(int j=1;j<=n+i-1;j++){
                if(j<=n-i) {
                    System.out.print("_");
                }
                else if(j<=n) {
                    System.out.print(nums++);
                }
                else {
                    System.out.print(--nums);
                }
            }
            System.out.println();
        }
    }
}