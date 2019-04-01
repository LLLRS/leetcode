class Solution {
    private class Node{

        public int cnt;
        public ArrayList<Integer> values;

        public Node(int cnt){
            this.cnt = cnt;
            this.values = new ArrayList<>();
        }

    }

    List<Integer> res = null;
    public List<Integer> topKFrequent(int[] nums, int k) {
        res = new ArrayList<>();

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums)
            hm.put(num,hm.getOrDefault(num,0) + 1);

        Node[] nodes = new Node[nums.length+1];
        for(int ch : hm.keySet()){
            int cnt = hm.get(ch);

            Node cur = nodes[cnt];
            if(cur == null)
                cur = new Node(cnt);

            cur.values.add(ch);
            nodes[cnt] = cur;
        }

        for(int i=nums.length;i>=0;i--){
            Node cur = nodes[i];
            if(cur!=null){
                res.addAll(cur.values);
                if(res.size() == k)
                    break;
            }
        }

        return res;
    }
}