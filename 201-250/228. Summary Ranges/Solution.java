public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new LinkedList<>();
        if(nums==null||nums.length==0)return result;
        //pre标记一段连续数的首位
        int pre=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1||nums[i+1]!=nums[i]+1){
                result.add(getRange(pre,nums[i]));
                //在不连续的情况下且不等于最后一个数，将下一个元素标记位首位
                if(i!=nums.length-1)
                    pre=nums[i+1];
            }
        }
        return result;
    }
    //这个方法的功能是转换输出格式
    private String getRange(int i,int j){
        if(i==j)return ""+j;
        return i+"->"+j;
    }
}
