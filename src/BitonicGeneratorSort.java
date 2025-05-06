import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BitonicGeneratorSort {
    public static ArrayList<Integer> bito(int[] a){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(i%2==0) even.add(i);
            else odd.add(i);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        res.addAll(even);
        res.addAll(odd);
        return res;
    }
    public static void main(String[] args){
        int[] a={0,1,2,3,4,5,6,7,8,9};
        System.out.println(bito(a));
    }
}
