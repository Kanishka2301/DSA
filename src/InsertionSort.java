public class InsertionSort {
    public static void main(String[] args){
        int[] a={11,10,32,23,4};
        for(int i=0;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int num:a) {
            System.out.print(num+" ");
        }
    }
}
