class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {

        Arrays.sort(tokens);
        int res = 0,point = 0;
        int l = 0,r = tokens.length-1;

        while (l <= r && (P >= tokens[l] || point > 0)) {
            while (l <= r && P >= tokens[l]) {
                P -= tokens[l++];
                point++;
            }

            res = Math.max(res,point);
            if(l <= r && point > 0){
                P += tokens[r--];
                point--;
            }
        }

        return res;
    }
}