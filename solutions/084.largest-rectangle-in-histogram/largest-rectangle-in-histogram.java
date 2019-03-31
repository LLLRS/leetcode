class Solution {
    public static int largestRectangleArea(int[] hs) {
        int res = 0;
        if(hs==null || hs.length == 0)
            return res;
        int n = hs.length;
        Stack<Integer> sk = new Stack<>();
        sk.push(0);
        for(int i=1;i<=n;i++){
        	if(i<n&&hs[i] >= hs[sk.peek()]){
        		sk.push(i);
        	}else {
        		while(!sk.isEmpty()){
        			if(i<n&&hs[sk.peek()] <= hs[i])
        				break;
        			
        			int cur = sk.pop();
        			int l = 0;
        			if(!sk.isEmpty()) l = sk.peek() + 1;
        			
        			int r = i - 1;
        			res = Math.max(res, hs[cur] * (r-l+1));
        		}
        		sk.push(i);
        	}
        }
               
        return res;
    }
}