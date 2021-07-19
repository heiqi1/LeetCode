package com.lxs.algorithm.leetcode.algorithm051_100.algorithm079;

public class WordSearch1 {
    public boolean exist(char[][] board, String word) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (exist(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }


    private boolean exist(char[][] board, String word,int i,int j,int index){
        if (index==word.length()){
            return true;
        }
        if (i<0||i>=board.length||j<0||j>=board[0].length
                ||board[i][j]!=word.charAt(index)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';
        boolean exist=
                exist(board,word,i-1,j,index+1)||
                exist(board,word,i+1,j,index+1)||
                exist(board,word,i,j-1,index+1)||
                exist(board,word,i,j+1,index+1);
        board[i][j]=temp;
        return exist;
    }

}
