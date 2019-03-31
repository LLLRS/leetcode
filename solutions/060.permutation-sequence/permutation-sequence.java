class Solution {
    
     boolean flag = false;
     boolean used[] = null;
     String res = "";
     int cnt = 0;
     public String getPermutation(int n, int k) {
    	 used = new boolean[n+1];
    	 aux(n,k,new StringBuilder());    	 
    	 return res;        
     }
	private void aux(int n, int k, StringBuilder sb) {
		if(sb.length()==n){
			cnt++;
			if(k==cnt){
				res = sb.toString();
				flag = true;
			}			
			return;
		}
		
		for(int i=1;i<=n;i++){
			if(used[i]) continue;
			
			used[i] = true;
			sb.append(i);
			
			aux(n,k,sb);
			
			used[i] = false;
			sb.deleteCharAt(sb.length()-1);
			if(flag) return;
		}
		
	}
}