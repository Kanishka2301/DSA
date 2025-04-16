import java.util.*;

public class MergeArraysUsingUnion {
    public static List<Integer> sortarray(int[] a,int[] b){
        Set<Integer> set=new HashSet<>();
        for(int num:a){
            if(num!=0){
            set.add(num);}
        }
        for(int num:b){
            if(num!=0){
                set.add(num);}
        }
        List<Integer> unionist=new ArrayList<>(set);
        Collections.sort(unionist);
        return unionist;
    }
    public static void main(String[] args){
        int[] a={1,2,3,0,0,0};
        int[] b={2,5,6};
        System.out.println(sortarray(a,b));
    }
}
