class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        
        int[] count = new int[strs.length];
        count[0] = 1;
        
        for(int i=0;i<strs.length;i++){
            if(i>0&&count[i]==1) continue;
            
            List<String> tmp = new ArrayList<>();                  
            tmp.add(strs[i]);
                    
            for(int j=i+1;j<strs.length;j++){
            	
            	if(strs[i].length()!=strs[j].length()) continue;
            	 int[] arr = new int[26];    
            	 
                for(int k=0;k<strs[i].length();k++)
                    arr[strs[i].charAt(k)-97]++;
                
            	int cnt = strs[i].length();
            	
                for(int k=0;k<strs[j].length();k++){
                    int ch = strs[j].charAt(k)-97;
                    
                    arr[ch]--;
                    if(arr[ch]>=0) 
                    	cnt--;
                    else
                    	break;
                }
                
                if(cnt==0) {
                    count[j] = 1;
                    tmp.add(strs[j]);                    
                }   
            }
            res.add(tmp);
        }        
        return res;     
     }
}