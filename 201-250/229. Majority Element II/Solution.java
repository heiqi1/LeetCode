public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new LinkedList<>();
        if(nums==null||nums.length==0)return result;
        int elem1=0,count1=0,elem2=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elem1){
                count1++;
            }else if(nums[i]==elem2){
                count2++;
            }else if(count1!=0&&count2!=0){
                count1--;
                count2--;
            }else{
                if(count1==0){
                    elem1=nums[i];
                    count1=1;
                }else{
                    elem2=nums[i];
                    count2=1;
                }
            }
        }
        //上面只是计算出最多的两个数，接下来计算出出现的次数是否超过n/3
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elem1)count1++;
            else if(nums[i]==elem2)count2++;
        }
        if(count1>nums.length/3)result.add(elem1);
        if(count2>nums.length/3)result.add(elem2);
        return result;
    }
}
