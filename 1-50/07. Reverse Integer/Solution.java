public class Solution {
    public int reverse(int x) {
        if(x==0)return 0;
        int flag=x>0?1:-1;
        long result=0;
        x=Math.abs(x);
        while(x>0){
            result=result*10+x%10;
            x/=10;
        }
        if(result>Integer.MAX_VALUE)return 0;
        result*=flag;
        return (int)result;
    }
}
