public class BubbleSort {
    public static void bub(int[] a){
        boolean swapped;
        for(int i=0;i<a.length-1;i++){
            swapped=false;
            for(int j=0;j<a.length-1;j++){
                while(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args){
        int[] a={2,3,1,4,7};
        bub(a);
        for(int res:a) {
            System.out.print(res+" ");
        }
    }
}
