
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] result=new int[2];
        while(left<right){
            int mid=left+(right-left)/2;
            if((nums[left]+nums[right])==target)
                break;
            else if((nums[left]+nums[right])>target){
                //这里进行判断，到底是跳一半还是走一步
                if((nums[mid]+nums[left])>target)
                    right=mid;
                else
                    right--;
            }else{
                //这里进行判断，若是在nums[left]+nums[right]<target的情况下，mid+right也小于target，则可以直接将left定义为mid，因为使得等于target的值在右半边区间
                if((nums[mid]+nums[right])<target)
                    left=mid;
                else
                    left++;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
