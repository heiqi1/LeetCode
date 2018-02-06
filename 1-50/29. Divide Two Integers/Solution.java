public class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==0)return 0;
        if(divisor==1)return dividend;
        //为-1的情况
        if(divisor==-1){
            if(dividend==Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }
            return -dividend;
        }
        //标记正负情况
        final int sign=((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))? -1 : 1;
        long de=Math.abs((long)dividend);
        long ds=Math.abs((long)divisor);
        int result=0;
        while(de>=ds){
            int count=1;
            long sum=ds;
            //使用两数相加
            while(sum+sum<=de){
                sum+=sum;
                count+=count;
            }
            de-=sum;
            result+=count;
        }
        return result*sign;
    }
}
