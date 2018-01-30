public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new LinkedList<>();
        if(n==0)return result;
        generate("",n,n,result);
        return result;
    }
    private void generate(String s,int left,int  right,List<String> result){
        if(left>right)return;
        if(left==0&&right==0){
            result.add(s);
            return;
        }
        if(left>0){
            String str=s+"(";
            generate(str,left-1,right,result);
        }
        if(right>0){
            String str=s+")";
            generate(str,left,right-1,result);
        }
    }
}
