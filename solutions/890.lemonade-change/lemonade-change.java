class Solution {
    public boolean lemonadeChange(int[] bills) {

        int n = bills.length;
        if(n == 0) return true;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            if(bills[i] == 5){
                
                hm.put(5,hm.getOrDefault(5,0)+1);
            }else if( bills[i] == 10 ){

               if(!contain(hm,5,1))
                   return false;
               hm.put(10,hm.getOrDefault(10,0)+1);
    
            }else {
                if (!hm.containsKey(5) )
                    return false;
                else if(hm.containsKey(10)){
                    if (!contain(hm, 10, 1) || !contain(hm, 5, 1))
                        return false;
                    
                }else
                    if (!contain(hm, 5, 3))
                        return false;
                    
                }
        }
        
        return true;
    }
    
    private boolean contain(HashMap<Integer,Integer> hm,int s,int c){
        Integer t = hm.get(s);
        if(t == null)
            return false;
        
        if(t < c)
            return false;
        else if( t == c)
            hm.remove(s);
        else
            hm.put(s,t-c);
        
        return true;
    }
}