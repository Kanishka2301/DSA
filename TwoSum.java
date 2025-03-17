import java.util.*;
class solution{
    public static void main(String[] args){
        solution s=new solution();
        int[] n={2,7,11,15};
        int target=9;
        int[] res=s.twosum(n,target);
        System.out.println(res[0]+","+res[1]);
    }
    public  int[] twosum(int[] n,int target){
           HashMap<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<n.length;i++){
           int current=target-n[i];
           if(map.containsKey(current)){
            return new int[] {map.get(current),i};
           }
           map.put(n[i],i);
           }
           return null;
    }
}
