public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
    //使用map来映射值的关系
        HashMap<Integer,Integer> map=new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else{
                int[] result=new int[2];
                result[0]=map.get(target-nums[i]);
                result[1]=i;
                return result;
            }
        }
        return new int[2];
    }
}
