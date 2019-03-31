class Solution {
    public String convert(String s, int r) {
        
        if(s.length()==0) return "";
        int n = s.length();
        if(n<=r) return s;
        
        ArrayList<StringBuilder> list = new ArrayList<>();
        for(int i =0;i<r;i++)
        	list.add(new StringBuilder());
        int idx = 0;
        
        while(idx<n){
            for(int i=0;i<r&&idx<n;i++)
                list.get(i).append(s.charAt(idx++));
                
            for(int i=r-2;i>0&&idx<n;i--)
                list.get(i).append(s.charAt(idx++));
            
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder t : list)
            sb.append(t.toString());
        
        return sb.toString();
        
    }
}