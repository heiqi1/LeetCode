package com.lxs.algorithm.leetcode.algorithm051_100.algorithm084;

public class LargestRectangleInHistogram2 {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int res = 0;
        // 遍历每个柱子，以当前柱子的高度作为矩形的高 h，
        // 从当前柱子向左右遍历，找到矩形的宽度 w。
        for (int i=0;i<len;i++){
            int j=i;
            int h=heights[i];
            int w=1;
            //往左边找
            while (--j>=0&&heights[j]>=h){
                w++;
            }
            j=i;
            //往右边找
            while (++j<len&&heights[j]>=h){
                w++;
            }
            //记录最大面积
            res=Math.max(res,w*h);
        }
        return res;
    }

}
