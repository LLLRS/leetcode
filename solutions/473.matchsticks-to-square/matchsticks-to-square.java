class Solution {
    public boolean makesquare(int[] nums) {
        
        int len = nums.length;
        if(len<4) return false;
        
        int sum = 0;
        for(int i=0;i<len;i++)
            sum += nums[i];
        
        if(sum%4!=0) return false;        
        int side = sum/4;  

        Arrays.sort(nums);
        if(nums[len-1]>side) return false;
                
        boolean[] used = new boolean[len];
        for(int i=len-1;i>=0;i--){
            if(used[i]) continue;
            used[i] = true;
            
            if(nums[i]==side)
                continue;
            else{
                if(!aux(nums,used,side-nums[i],i))
                    return false;
            }                  
        }
        return true;        
    }
    
    private boolean aux(int[] n,boolean[] u,int s,int idx){
        
        
        if(s<0) return false;
        if(s==0) return true;
        
        for(int i=idx-1;i>=0;i--){
            if(u[i]) continue;
            
            if(!aux(n,u,s-n[i],i))
                 continue;

            u[i] = true;
            return true;    
        }

        return false;
    }
} 