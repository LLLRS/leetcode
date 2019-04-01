class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        
        HashMap<Integer, PriorityQueue<Integer>> hm = new HashMap<>();
        int end = 0;
        for(int t : arr){
            int st = Math.abs(t-x);
            PriorityQueue<Integer> ts = hm.getOrDefault(st,new  PriorityQueue<Integer>());
            ts.add(t);
            hm.put(st,ts);
            end = Math.max(end,st);
        }
        

        int cnt = 0;
        for(int i=0;i<=end;i++){
            PriorityQueue<Integer> ts = hm.get(i);
            if(ts != null){
                for(int t : ts){
                    list.add(t);
                    cnt++;
                    if(cnt == k) break;
                }
            }

            if(cnt == k) break;
        }

        Collections.sort(list);
        return list;
    }
}