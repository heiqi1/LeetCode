```
//该方法是暴力破解，会超时
public class Solution2 {
    public String longestPalindrome(String s) {
        int maxLen=0;
        int start=0;
        //i是字符串长度
        for(int i=0;i<s.length();i++){
            //j是字符串起始位置
            for(int j=0;j<s.length()-i;j++){
                //逐个判断是否是回文
                if(ispalindrome(s,i,j)&&(i+1)>maxLen){
                    maxLen=i+1;
                    start=j;
                }
            }
        }
        return s.substring(start,maxLen+start);
    }
    //判断是否是回文
    private boolean ispalindrome(String s,int i,int j){
        int left=j;
        int right=i+j;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
