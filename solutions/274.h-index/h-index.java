class Solution {
    public static int hIndex(int[] c) {
        
        Arrays.sort(c);
        
        int res = 0;
        int n = c.length;
        
        for(int i=0;i<n;i++){ 
        	if(c[i] >= n-i){
        		res = n-i;
        		break;
        	}
        		
        }
        
        
        return res;
    }
}