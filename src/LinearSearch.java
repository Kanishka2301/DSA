public class LinearSearch {
    public static void main(String[] args){
        int[] a={1,3,5,7};
        int key=5,flag=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] == key) {
                System.out.print("element found");
                flag = 1;
                break;
            }
        }
            if (flag == 0) {
                System.out.print("element not found");
            }
        }
}
