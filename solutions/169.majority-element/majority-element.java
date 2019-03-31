/*
* 暴力
* 排序
* hash
* 利用 majority Element至少会出现一半的性质
*/

class Solution {
    public int majorityElement(int[] nums) {
    
        int cnt = 0;
        int res = 0;
        
        for(int num : nums){
            if(cnt == 0)
                res = num;
            
            cnt += (res == num ? 1 : -1);
            
        }
        
        return res;
        
    }
}