public class ContainerWithMostWater {
    public static int maxA(int[] height){
        int l=0,r=height.length-1,maxArea=0;
        while(l<r){
            int currentArea=Math.min(height[l],height[r])*(r-l);
            maxArea=Math.max(maxArea,currentArea);
            if (height[l]<height[r]) l++;
            else r--;
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxA(height));
    }
}
