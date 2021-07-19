package com.lxs.algorithm.leetcode.algorithm001_050.algorithm14;

public class LongestCommonPrefix1 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        StringBuffer sb=new StringBuffer();
        int min=Integer.MAX_VALUE;
        //公共前缀一定小于等于字符数组中长度最短的字符串
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min)
                min=strs[i].length();
        }
        //以strs[0]为参照
        for(int i=0;i<min;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return sb.toString();
                }
            }
            //搜索整个字符数组，这个字符是公共前缀，所以加入到字符流中
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
