package com.lxs.algorithm.leetcode.algorithm051_100.algorithm084;

public class LargestRectangleInHistogram1 {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int res = 0;
        for (int left = 0; left < len; left++) {
            int minHeight = Integer.MAX_VALUE;
            for (int right = left; right < len; right++) {
                minHeight = Math.min(minHeight, heights[right]);
                res = Math.max(res, (right - left + 1) * minHeight);
            }
        }
        return res;
    }

}
