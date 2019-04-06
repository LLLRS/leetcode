class Solution {
    //N可以很大，但是cells数组的长度固定为8
    public int[] prisonAfterNDays(int[] cells, int N) {
        
        Map<String,Integer> map = new HashMap<>();
        while(N > 0){
            map.put(Arrays.toString(cells),N--);
            int[] t = new int[8];
            for(int i=1;i<7;i++)
                t[i] = cells[i-1] == cells[i+1] ? 1 : 0;
            
            cells = t;
            if(map.containsKey(Arrays.toString(cells)))
                N = N % (map.get(Arrays.toString(cells)) - N);
        }

        return cells;
    }
}