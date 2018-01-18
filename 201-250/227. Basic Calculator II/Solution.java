public class Solution {
    public int calculate(String s) {
        Stack<Integer>  stack=new Stack<>();
        int result=0,num=0;
        char lastSign='+';
        char[] chars=s.toCharArray();
        
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            //这里是将不止一位的数字还原成原本数据，譬如332的字符串
            if(c>='0'&&c<='9'){
                num=num*10+c-'0';
            }
            //根据上一个标志符号位来进行运算，将上一个元素与当前元素计算
            if(c=='+'||c=='-'||c=='*'||c=='/'||i==chars.length-1){
                if(lastSign=='+'||lastSign=='-'){
                    int temp=lastSign=='+'?num:-num;
                    stack.push(temp);
                    result+=temp;
                }
                if(lastSign=='*'||lastSign=='/'){
                    result-=stack.peek();
                    int temp=lastSign=='*'?stack.pop()*num:stack.pop()/num;
                    stack.push(temp);
                    result+=temp;
                }
                //若是当前字符c是运算符号，直接到此步，将lastSign赋予，到下一步就可以计算
                lastSign=c;
                num=0;
            }
        }
        return result;
    }
}
