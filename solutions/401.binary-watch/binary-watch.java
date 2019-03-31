class Solution {
    
    List<Integer> h = new ArrayList<>();
    List<Integer> m = new ArrayList<>();
    
    public List<String> readBinaryWatch(int num) {
        
        List<String> res = new ArrayList<>();
        //0=<n<=10
        int[] hour = {8,4,2,1};
        int[] minute = {32,16,8,4,2,1};
        
        for(int i=0;i<=4&&num-i>=0;i++){
            combineHour(hour,i,0,0,0);
            combineMinute(minute,num-i,0,0,0);
            for(int ht : h)
                for(int mt : m){
                    if(mt<10) 
                        res.add(ht+":0"+mt);                      
                    else
                        res.add(ht+":"+mt);
                }

            h.clear();
            m.clear();
            
        }
        
        return res;  
    }
    

    private void combineHour(int[] nums,int k,int sta,int t,int index){
        if(k==index&&t<=11){   
            h.add(t);
            return;
        }

        for(int i = sta;i<nums.length;i++)
            combineHour(nums,k,i+1,t+nums[i],index+1);
    }
    
    private void combineMinute(int[] nums,int k,int sta,int t,int index){
        if(k==index&&t<=59){   
            m.add(t);
            return;
        }

        for(int i = sta;i<nums.length;i++)
            combineMinute(nums,k,i+1,t+nums[i],index+1);
    }
}