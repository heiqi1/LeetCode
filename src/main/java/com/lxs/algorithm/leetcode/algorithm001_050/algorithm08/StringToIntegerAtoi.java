package com.lxs.algorithm.leetcode.algorithm001_050.algorithm08;

public class StringToIntegerAtoi {
    public int myAtoi(String str) {
        str=str.trim();
        int result=0;
        int flag=1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0&&(c=='-'||c=='+')){
                flag=c=='+'?1:-1;
            }else if(c>='0' && c<='9'){
                //防止溢出
                if(result>(Integer.MAX_VALUE-(c-'0'))/10)return flag>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
                else result=result*10+(c-'0');
            }else{
                //若是第二位以后出现非数字，则直接返回
                return flag>0?result:-result;
            }
        }
        return flag>0?result:-result;
    }
}
