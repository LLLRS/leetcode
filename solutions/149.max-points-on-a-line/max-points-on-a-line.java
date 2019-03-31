/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
class Solution {
    public  int maxPoints(Point[] points) {
        int res = 1;
        if(points.length==0) return 0;
            
        for(int i =0;i<points.length;i++){
        	HashMap<Double,Integer> hm = new HashMap<>();
        	hm.put((double) Integer.MIN_VALUE,1);
            
        	int de = 0;
        	for(int j=i+1;j<points.length;j++){
        		
        		if((points[i].y==points[j].y)&&(points[i].x==points[j].x)){ 
        			de++;
        		}else{
	        		double tt = dis(points[i],points[j]);
	        		if(hm.containsKey(tt))
	        			hm.put(tt,hm.get(tt)+1);
	        		else
	        			hm.put(tt,2);	     		
	        	}   
        	}
            
                    		
            for(int re:hm.values())	        		
                res  = Math.max(res, de+re);
        }

        return res;
    }
        
	public static double dis(Point p1, Point p2) {
		
		if((p1.x-p2.x)==0) 
			return (double)Integer.MAX_VALUE;
        if(p1.y==p2.y) 
			return 0;
		java.math.BigDecimal bd1 = new java.math.BigDecimal(Double.toString(p1.y-p2.y)); 
        java.math.BigDecimal bd2 = new java.math.BigDecimal(Double.toString(p1.x-p2.x)); 
        return bd1.divide  
               (bd2,16,java.math.BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}
}