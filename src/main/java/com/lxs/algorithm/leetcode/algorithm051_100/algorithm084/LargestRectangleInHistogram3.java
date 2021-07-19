package com.lxs.algorithm.leetcode.algorithm051_100.algorithm084;

import java.util.Stack;

public class LargestRectangleInHistogram3 {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int res = 0;
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<=len;i++){
            int h=(i==len?0:heights[i]);
            if (stack.isEmpty()||h>=heights[stack.peek()]){
                stack.push(i);
            }else {
                int top=stack.pop();
                res=Math.max(res,(stack.isEmpty()?i:i-stack.peek()-1)*heights[top]);
                i--;
            }
        }
        return res;
    }

}
