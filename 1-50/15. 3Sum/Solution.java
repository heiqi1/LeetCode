public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null||nums.length<=2)return result;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            //防止数组元素重复
            if(i==0||nums[i]>nums[i-1]){
                int left=i+1;
                int right=nums.length-1;
                if(nums[i]>0)break;
                //双指针移动
                while(left<right){
                    if((nums[i]+nums[left]+nums[right])==0){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        result.add(temp);
                        left++;
                        right--;
                        //若是相等，则把left向前移动一位
                         while(left<right&&nums[left]==nums[left-1])
                            left++;
                        //若是相等，则把right后移一位
                        while(left<right&&nums[right]==nums[right+1])
                            right--;
                    }else if((nums[i]+nums[left]+nums[right])>0){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
