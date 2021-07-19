package com.lxs.algorithm.leetcode.algorithm001_050.algorithm04;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        if(len%2==0)return (find(nums1,nums2,len/2)+find(nums1,nums2,len/2+1))/2.0;
        else return (double)(find(nums1,nums2,len/2+1));
    }
    public int find(int[] nums1,int[] nums2,int len){
        int result=0;
        int i=0,j=0;
        while(len!=0&&i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j])result=nums1[i++];
            else result=nums2[j++];
            len--;
        }
        if(len!=0){
            if(i<nums1.length)result=nums1[i+len-1];
            else result=nums2[j+len-1];
        }
        return result;
    }
}
