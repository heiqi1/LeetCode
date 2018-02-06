public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result=new LinkedList<>();
        if(s==null||s.length()==0) return result;
        //因为每个词长度一样，得每个词的长度
        int wordLen=words[0].length();
        HashMap<String,Integer> map=new HashMap<>();
        //统计数组中每个词出现的次数，放入哈希表中待用
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }
        }
        //错开位进行统计
        for(int i=0;i<wordLen;i++){
        //建立新的哈希表，记录本轮搜索中窗口内单词出现的次数
            HashMap<String,Integer> cur=new HashMap<>();
            //start是窗口的开始，count表明窗口内存在多少词
            int start=i,count=0;
            for(int j=i;j<=s.length()-wordLen;j+=wordLen){
                String temp=s.substring(j,j+wordLen);
                //确定词是否在给定数组中
                if(map.containsKey(temp)){
                    cur.put(temp,cur.containsKey(temp)?cur.get(temp)+1:1);
                    count++;
                    while(cur.get(temp)>map.get(temp)){
                        String leftMost=s.substring(start,start+wordLen);
                        cur.put(leftMost,cur.get(leftMost)-1);
                        start=start+wordLen;
                        count--;
                    }
                    if(count==words.length){
                        String leftMost=s.substring(start,start+wordLen);
                        cur.put(leftMost,cur.get(leftMost)-1);
                        result.add(start);
                        start+=wordLen;
                        count--;
                    }
                //重新开始
                }else{
                    cur.clear();
                    start=j+wordLen;
                    count=0;
                }
            }
        }
        return result;
    }
}
