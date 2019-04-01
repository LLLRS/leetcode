
public class Solution {
    private boolean[] used = null;
    private HashMap<String,Boolean> hm = null;
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = (1+maxChoosableInteger)*maxChoosableInteger/2;
        if(sum < desiredTotal) return false;
        if(desiredTotal <= 0 || maxChoosableInteger >= desiredTotal ) return true;
        
        hm = new HashMap<>();
        used = new boolean[maxChoosableInteger+1];

        return dfs(desiredTotal);
    }

    private boolean dfs(int desiredTotal){
        if(desiredTotal <= 0) return false;
        
        String key = Arrays.toString(used);
        if(!hm.containsKey(key)) {
            for (int i = 1; i < used.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    if (!dfs(desiredTotal - i)) {
                        hm.put(key,true);
                        used[i] = false;
                        return true;
                    }
                    used[i] = false;
                }
            }
            hm.put(key,false);
        }
        return hm.get(key);
    }


}
