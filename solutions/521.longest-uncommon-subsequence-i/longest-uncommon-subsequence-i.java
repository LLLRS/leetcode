class Solution {
    public int findLUSlength(String a, String b) {
        
        int n1 = a.length();
        int n2 = b.length();
        
        if(a.equals(b)) return -1;
        
        return Math.max(n1,n2);
    }
}