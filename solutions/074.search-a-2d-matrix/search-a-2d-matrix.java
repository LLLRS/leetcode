class Solution {
    public boolean searchMatrix(int[][] m, int ta) {
        int row = m.length;
        if(row==0) return false;
        int col = m[0].length;        
        if(col==0) return false;
        
        for(int i=0;i<row;i++){
            if(ta>m[i][col-1]) continue;
            
            return binarySearch(m[i],ta,0,col-1);
        }
        
        return false;      
    }
    
    public boolean binarySearch(int[] a,int ta,int l,int r){
        
        if(l>r) return false;
        
        int mid = l +(r-l)/2;
        
        if(a[mid]==ta) return true;
        else if(a[mid]<ta)  return binarySearch(a,ta,mid+1,r);
        else return binarySearch(a,ta,l,mid-1);
    }
}