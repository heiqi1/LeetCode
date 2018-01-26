public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> result=new ArrayList<>();
        if(nums==null||nums.length<=3)return result;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    if(nums[i]+nums[j]+nums[left]+nums[right]==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
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
                    }else if(nums[i]+nums[j]+nums[left]+nums[right]>target){
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
