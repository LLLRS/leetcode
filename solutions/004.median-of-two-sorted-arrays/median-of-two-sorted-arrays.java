class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length,n = B.length;
        int mid = (m+n)/2 + 1;
                     
       
        int i = 0,j = 0;
        List<Integer> list = new ArrayList<>();
        for(;i<m&&j<n;){
            if(A[i] > B[j])
                list.add(B[j++]);
            else
                list.add(A[i++]);
            
            if(mid == list.size())
                break;
        }
        
        while(list.size() < mid){
            if(i<m) list.add(A[i++]);
            if(j<n) list.add(B[j++]);
        }

        if((m+n)%2 == 0)
            return (list.get(list.size()-1) + list.get(list.size()-2) ) /2.0;
        
        return list.get(list.size()-1); 
    }
}