class Solution {
    public boolean isHappy(int n) {
        if(n<=0)  return false;
        
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0,t = 0;
        
        
        while(sum!=1){
        	sum = 0;
        	
            while(n!=0){
                t = n%10;
                n = n/10;                
                sum += t*t;
            }
            
            n = sum;
            if(!hs.contains(sum))
                hs.add(sum);
            else
                return false;
        }        
        return true;
    }
}