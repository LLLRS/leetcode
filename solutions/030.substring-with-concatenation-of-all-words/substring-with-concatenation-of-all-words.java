class Solution {
    public List<Integer> findSubstring(String s, String[] w){
        List<Integer> res = new ArrayList<>();
        if(w.length==0)  return res;
        int len = w[0].length();
        HashMap<String, Integer> hs = new HashMap<>();
        
        for(int i=0;i<w.length;i++)
            if(hs.containsKey(w[i]))
                hs.put(w[i],hs.get(w[i])+1);
            else
                hs.put(w[i],1);
    
        for(int i=0;i+len*w.length<=s.length();i++){            
            HashMap<String, Integer> ht = new HashMap<>(); 
            int cnt = 0;
            for(int j=i;j+len<=s.length();j +=len){
                 String t = s.substring(j,j+len);
                 if(!hs.containsKey(t)) break;
                 if(ht.containsKey(t)){
                     ht.put(t,ht.get(t)+1);
                     if(ht.get(t)>hs.get(t))
                        break;  
                 }else
                     ht.put(t,1);     
                
                 cnt++;
                 if(cnt==w.length){
                     res.add(i);
                     break;
                 }                
            }
        }
        return res;
    }
}