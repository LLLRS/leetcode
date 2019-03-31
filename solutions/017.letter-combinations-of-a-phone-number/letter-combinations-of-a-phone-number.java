class Solution {
    
    String[] aux = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
        
    public List<String> letterCombinations(String digits) {
        res.clear();
        if(digits.length()==0) return res;
        
        letterCombinationsAux(digits,0,"");
        return res;
    }
    
    private void letterCombinationsAux(String d,int index,String s){
        if(index==d.length()){
            res.add(s);
            return ;
        }
        
        String t = aux[d.charAt(index)-'0'];
        for(int i = 0;i<t.length();i++)
            letterCombinationsAux(d,index+1,s+t.charAt(i));
        
        return ; 
    }
}