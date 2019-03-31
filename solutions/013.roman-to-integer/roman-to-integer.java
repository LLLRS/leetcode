class Solution {
    public int romanToInt(String s) {
        int res = 0;
        
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);        
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);            
        hm.put('D',500);            
        hm.put('M',1000);    
            
        for(int i=0;i<s.length();i++){
            //小于等于前面的数字，先加上当前的数字
            if(i==0 || hm.get(s.charAt(i)) <= hm.get(s.charAt(i-1)) )
                res += hm.get(s.charAt(i));
            else //大于的前面的数字，加上当前的数字减去二倍前面的数字，这样可以把在上一个循环多加数减掉，
                res += hm.get(s.charAt(i)) - 2*hm.get(s.charAt(i-1)); 
        }
        
        return res;
    }
}