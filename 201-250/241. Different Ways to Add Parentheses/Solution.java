public class Solution {
    //因为要递归的使用map，所以这里使用全局变量，主要是用来判断是否数据已经加入进入
    HashMap<String,List<Integer>> map=new HashMap<>();
    public List<Integer> diffWaysToCompute(String input) {
        if(map.containsKey(input))return map.get(input);
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='+'||input.charAt(i)=='-'||input.charAt(i)=='*'){
                String part1=input.substring(0,i);
                String part2=input.substring(i+1);
                List<Integer> left=diffWaysToCompute(part1);
                List<Integer> right=diffWaysToCompute(part2);
                for(Integer x:left){
                    for(Integer y:right){
                        if(input.charAt(i) == '+') result.add(x+y);
                        else if(input.charAt(i) == '-') result.add(x-y);
                        else result.add(x*y);
                    }
                }
            }
        }
        if(result.size()==0)result.add(Integer.valueOf(input));
        map.put(input,result);
        return result;
    }
}
