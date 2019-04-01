class Solution {
    public int maxProduct(String[] words) {
        int  res = 0;
        int n = words.length;

        int[] aux = new int[n];
        for(int i=0;i<n;i++){
            String t = words[i];
            for(int j = 0;j<t.length();j++)
                aux[i] |= 1 << (t.charAt(j) - 'a');
            
        }

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                if ((aux[i] & aux[j]) == 0 && (words[i].length() * words[j].length() > res))
                   res = words[i].length() * words[j].length();
            }

        return res;
    }
}