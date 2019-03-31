class Solution {
    public int maxArea(int[] height) {
        if(height.length<2) 
    		return 0;
        int res = 0;
        
        int l=0,r=height.length-1;
        
        while(l<r){
        	int tmp = 0;
        	if(height[l]<height[r])
        		tmp = (r-l) * height[l++];
        	else
        		tmp = (r-l) * height[r--];
        	
            res = Math.max(res, tmp);
        }
        return res;
    }
}