class Solution {
    public void merge(int A[], int m, int B[], int n) {
        
        
       if(n==0) return;
       int[] C = new int[m];
       for(int i=0;i<m;i++)
           C[i] = A[i];
        
        int a = 0,b = 0;
        for(int i=0;i<m+n;i++){
            if(a>=m) A[i] = B[b++];
            else if(b>=n) A[i] = C[a++];
            else if(C[a]>B[b]) A[i] = B[b++];
            else A[i] = C[a++];
        }
    }
}