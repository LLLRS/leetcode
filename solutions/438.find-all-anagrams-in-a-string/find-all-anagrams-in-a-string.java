class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     		 	 
		 ArrayList<Integer> arr  = new ArrayList<>();  
		 if(s.length()<p.length()) return arr;
		 
		 int l = 0,r = p.length();
		 int freq[] = new int[26];
		 
		 while(r<=s.length()){
			 String t = s.substring(l++, r++);
			 int count  = 0;
			 
			 for(int i=0;i<t.length();i++)
				 freq[t.charAt(i)-97] ++;
			 
			 for(int i=0;i<p.length();i++)
				 freq[p.charAt(i)-97] --;
				
			 for(int i=0;i<26;i++)
				 if(freq[i]==0)
					count++;
				 else
					freq[i]=0; 
			 
			 if(count == 26)
				 arr.add(l-1);
		 }
		 
		 return arr;
   
    }
}