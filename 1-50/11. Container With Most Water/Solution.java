public class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            maxArea=Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
            //向高度高的一边靠拢
            if(height[left]<height[right]){
                left++;
            }else{
            // 如果右边较低，则将右边向中间移一点
                right--;
            }
        }
        return maxArea;
    }
}
