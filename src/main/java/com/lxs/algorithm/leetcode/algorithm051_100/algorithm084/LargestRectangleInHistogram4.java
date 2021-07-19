package com.lxs.algorithm.leetcode.algorithm051_100.algorithm084;

import java.util.Stack;

public class LargestRectangleInHistogram4 {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int[] temp = new int[heights.length + 2];
        System.arraycopy(heights, 0, temp, 1, heights.length);
        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[stack.peek()] > temp[i]) {
                int cur = stack.pop();
                int left = stack.peek();
                int width = i - left - 1;
                res = Math.max(res, width * temp[cur]);
            }
            stack.push(i);
        }
        return res;
    }

}
