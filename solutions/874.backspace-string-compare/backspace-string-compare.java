class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        String NewS = backspaceCompareAux(S);
        String NewT = backspaceCompareAux(T);
        
        return NewT.equals(NewS); 
        
    }
    
    private String backspaceCompareAux(String s){
        
        Stack<Character> t = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                if(!t.isEmpty())
                    t.pop();
            }else
                t.push(ch);
        }
        
        StringBuilder res = new StringBuilder();
        while(!t.isEmpty()){
        	res.append(t.pop());
        }
        
        return res.toString();
    }
}