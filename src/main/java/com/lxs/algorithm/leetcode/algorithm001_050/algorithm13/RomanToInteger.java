package com.lxs.algorithm.leetcode.algorithm001_050.algorithm13;

/**
*罗马数字中较小的字母在较大的字母之前意味着较大的字母减去较小的字母;
*而较小的字母在较大的字母之后意味着较大的字母加上较小的字母。
*/
public class RomanToInteger {
    public int romanToInt(String s) {
        int[] nums=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X':
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum-=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return sum+nums[s.length()-1];
    }
}





