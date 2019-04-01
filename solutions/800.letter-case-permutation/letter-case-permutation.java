class Solution {
    
     List<String> res = new ArrayList<>();     
     public  List<String> letterCasePermutation(String s) {
    	 
    	 aux(s,"",0);         
    	 return res;
     }

	private  void aux(String s,String st, int cnt) {
		if(cnt==s.length()){
			res.add(st);
			return;
		}
		
		
		char ch = s.charAt(cnt);
		aux(s, st+ch, cnt+1);
		
		if(Character.isLowerCase(ch)){
			ch = Character.toUpperCase(ch);
			aux(s, st+ch, cnt+1);
		}else if(Character.isUpperCase(ch)){
			ch = Character.toLowerCase(ch);
			aux(s, st+ch, cnt+1);
		}			
	}
}