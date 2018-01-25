public class Solution {
    public String intToRoman(int num) {
        String[][] roman = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };
        int index=0;
        String result="";
        while(num>0){
            int remain=num%10;
            result=roman[index++][remain]+result;
            num/=10;
        }
        return result;
    }
}
