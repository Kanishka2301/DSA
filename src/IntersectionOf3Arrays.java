import java.util.*;

public class IntersectionOf3Arrays {
    public static  List<Integer> inter(int[] n1,int[] n2,int[] n3){
        List<Integer> set=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<n1.length && j<n2.length && k<n3.length){
            if(n1[i]==n2[j] && n1[i]==n3[k]){
                set.add(n1[i]);
                i++;j++;k++;
            }
            else if(n1[i]<n2[j]) i++;
            else if(n2[j]<n3[k]) j++;
            else k++;
        }
        return set;
    }
    public static void main(String[] args){
        int[] n1={1,2,3,4,5},n2={1,2,5,7,9},n3={1,3,4,5,8};
        System.out.println(inter(n1,n2,n3));
    }
}
