package com.lxs.leetcode.algorithm300_.algorithm680;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        if(s==null)return false;
        if(s.length()<2)return true;
        s=s.replaceAll("\\W", "").toLowerCase(); 
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                int left=start,right=end-1;
                while(left<right){
                    if(s.charAt(left) != s.charAt(right))break;
                    left++;
                    right--;
                    if(left>=right)return true;
                }
                start++;
                while(start<end){
                    if(s.charAt(start)!=s.charAt(end))
                        return false;
                    start++;
                    end--;
                }
            } 
        }
        return true;
    }
}
