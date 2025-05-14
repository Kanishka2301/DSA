public class SelectionSort {
    public static void main(String[] args){
        int[] a={23,1,3,45};
        for(int i=0;i<a.length-1;i++){
            int temp=i;
            for(int j=i+1;j<a.length;j++) {
                if (a[j] < a[temp]) {
                    temp = j;
                }
            }
                 if(temp!=i){
                     int t=a[i];
                     a[i]=a[temp];
                     a[temp]=t;
                 }
            }
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
