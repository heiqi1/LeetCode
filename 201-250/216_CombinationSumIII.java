```
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new LinkedList<>();
        List<Integer>temp=new LinkedList<>();
        combin(k,n,1,temp,result);
        return result;
    }
    private void combin(int k,int target,int index,List<Integer> temp,List<List<Integer>> result){
        //这里对于k进行控制，若是列表长度大于k仍然没有符合要求，直接返回
        if(target<0||temp.size()>k){
            return;
        //这里加上一个控制条件
        }else if(target==0&&temp.size()==k){
            result.add(new LinkedList<>(temp));
            return;
        }else{
            for(int i=index;i<=9;i++){
                temp.add(i);
                //这里i+1是指跳过自己
                combin(k,target-i,i+1,temp,result);
                temp.remove(temp.size()-1);
            }
        }
    }
}
```
