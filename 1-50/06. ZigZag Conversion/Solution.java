public class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] result = new StringBuilder[numRows];
        char[] c=s.toCharArray();
        for(int i=0;i<result.length;i++)result[i] = new StringBuilder("");
        int i=0;
        while(i<s.length()){
            for(int index=0;index<numRows&&i<s.length();index++){
                result[index].append(c[i++]);
            }
            for(int index=numRows-2;index>=1&&i<s.length();index--){
                result[index].append(c[i++]);
            }
        }
        //将后面的字符串都合并到result[0]中
        for(int index=1;index<result.length;index++){
            result[0].append(result[index]);
        }
        return result[0].toString();
    }
}
