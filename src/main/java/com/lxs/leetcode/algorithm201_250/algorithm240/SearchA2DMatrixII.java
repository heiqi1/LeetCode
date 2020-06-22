package com.lxs.leetcode.algorithm201_250.algorithm240;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return false;
        int row=matrix.length;
        int col=matrix[0].length;
        int i=row-1;
        int j=0;
        while(i>=0&&j<col){
            int temp=matrix[i][j];
            if(temp==target){
                return true;
            }else if(temp>target){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}
