public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length<=1)
            return false;
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (i>k)
                set.remove(nums[i-k-1]);
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
