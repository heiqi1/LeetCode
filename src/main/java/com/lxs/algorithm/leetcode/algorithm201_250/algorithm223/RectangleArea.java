package com.lxs.algorithm.leetcode.algorithm201_250.algorithm223;

public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1=(C-A)*(D-B);
        int area2=(G-E)*(H-F);
        int overlapArea=overlap(A,B,C,D,E,F,G,H);
        return area1+area2-overlapArea;
    }
     private int overlap(int A, int B, int C, int D, int E, int F, int G, int H) {
         int h1=Math.max(A,E);
         int h2=Math.min(C,G);
         int h=h2-h1;
         
         int v1 = Math.max(B, F);  
         int v2 = Math.min(D, H);  
         int v = v2 - v1;  
         //边界判断，防止溢出
          if(C < E || G < A || D < F || H < B){
            return  0;}
         else return h*v;
     }
}
