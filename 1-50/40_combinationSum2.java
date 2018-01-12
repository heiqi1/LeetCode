public class combinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new LinkedList<>();
        List<Integer> temp=new LinkedList<>();
        Arrays.sort(candidates);
        combin(candidates,target,0,temp,result);
        return lists;
    }
    private void combin(int[] array,int target,int index,List<Integer> temp,List<List<Integer>> result){
        if (target<0){
            return;
        }else if (target==0){
            list.add(new LinkedList<>(temp));
        }else {
            for (int i=index;i<array.length;i++){
                // 跳过本轮剩余的重复元素
                if(i>index &&array[i]==array[i-1]) continue;
                temp.add(array[i]);
                // 递归时下标加1
                combin(array,target-array[i],i+1,temp,result);
                temp.remove(temp.size()-1);
            }
        }
    }
}
