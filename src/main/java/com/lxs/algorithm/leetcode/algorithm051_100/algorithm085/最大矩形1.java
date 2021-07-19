package com.lxs.algorithm.leetcode.algorithm051_100.algorithm085;

import java.util.Stack;

/**
 * @ClassName: 最大矩形1
 * @Description:
 * @Author: https://github.com/xs-L
 * @Date: 2021年07月19日 下午 10:08
 */
public class 最大矩形1 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int col = matrix.length;
        int row = matrix[0].length;
        int[] heights = new int[row];
        int res = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            res = Math.max(res, largestRectangleArea(heights));
        }
        return res;
    }

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
