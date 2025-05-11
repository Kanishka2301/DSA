public class CountOfSwaps {
    public static void main(String[] args){
        int[] arr={5,50,20,10,40,30};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i])  max=j;
            }
            if(max!=i){
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
                count++;
            }
        }
        System.out.println(count);
    }
}
