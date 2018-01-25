public class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        //采用分治法
        return commonPrefix(strs,0,strs.length-1);
    }
    //该方法是将字符数组分为左右两块
    private String commonPrefix(String[] strs,int left,int right){
        //字符串数组长度等于1直接返回
        if(left==right)
            return strs[left];
        //字符串数组等于2再比较一次
        if(right==left+1)
            return commonString(strs[left],strs[right]);
        int mid=left+(right-left)/2;
        //左半部分
        String lcp1=commonPrefix(strs,left,mid);
        //右半部分
        String lcp2=commonPrefix(strs,mid+1,right);
        //比较字符串
        return commonString(lcp1,lcp2);
    }
    //字符串比较方法
    private String commonString(String s1,String s2){
        for(int i=0;i<s1.length();i++){
        //因为s1的长度可能大于s2
            if(i>=s2.length()||s1.charAt(i)!=s2.charAt(i))
                return s1.substring(0,i);
        }
        return s1;
    }
}
