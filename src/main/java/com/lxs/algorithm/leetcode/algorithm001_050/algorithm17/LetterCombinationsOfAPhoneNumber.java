package com.lxs.algorithm.leetcode.algorithm001_050.algorithm17;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result=new LinkedList<>();
        String[] table = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        if(digits==null||digits.length()==0)return result;
        StringBuffer temp=new StringBuffer();
        combination(digits,0,temp,table,result);
        return result;
    }
    public void combination(String digits,int index,StringBuffer temp,String[] table,List<String>result){
        if(digits.length()==index){
            result.add(temp.toString());
            return;
        }
        int m=digits.charAt(index)-'0';
        for(int i=0;i<table[m].length();i++){
            temp.append(table[m].charAt(i));
            combination(digits,index+1,temp,table,result);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
