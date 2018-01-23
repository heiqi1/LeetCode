public class Solution1 {
    String maxLen="";
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            //计算奇数子字符串
            palindromeLen(s,i,0);
            //计算偶数子字符串
            palindromeLen(s,i,1);
        }
        return maxLen;
    }
    private void palindromeLen(String s,int index,int offset){
        int left=index;
        int right=index+offset;
        //判断是否是回文，字符串长度为1自然是回文，则直接left--和right++，在left>0的时候
        while(start>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++:
        }
        //截取当前最长的回文子串
        String cur=s.substring(left+1,right);
        //判断是否比全局最长还长
        maxLen=Math.max(cur.length(),maxLen);
    }
}
