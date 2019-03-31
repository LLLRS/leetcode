class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int len = s.length();
        List<List<Integer>> res = new ArrayList<>();
        
        if(len<3) return res;
        
        int l = 0,r = 0;
        int count = 0;
        while(r<len){
            if(s.charAt(l)==s.charAt(r)){
                count ++;
                r++;
                
                if(r==len){
                    if(count>=3) 
                        res.add(Arrays.asList(l,r-1));
                }
            }else{
                if(count>=3) 
                        res.add(Arrays.asList(l,r-1));
                
                count = 0;
                l = r;  
            }
        }
        
        return res;
        
    }
}