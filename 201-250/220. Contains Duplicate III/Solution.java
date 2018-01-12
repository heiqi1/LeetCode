public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(set.ceiling(temp)!=null&&set.ceiling(temp)<=t+temp)return true;
            if(set.floor(temp)!=null&&temp<=t+set.floor(temp))return true;
            set.add(temp);
            if(set.size()>k)set.remove(nums[i-k]);
        }
        return false;
    }
}
