class Solution {
    private class Node{

        public String word;
        public TreeMap<Character, Node> next;

        public Node(){
            this.word = null;
            this.next = new TreeMap<>();
        }

    }

    List<String> res = new ArrayList<>();
    public List<String> topKFrequent(String[] words, int k) {


        HashMap<String,Integer> hm = new HashMap<>();
        for(String word : words)
            hm.put(word,hm.getOrDefault(word,0)+1);

        Node[] nodes = new Node[words.length + 1];
        for(String s : hm.keySet()){
            int cnt = hm.get(s);
            Node cur = nodes[cnt];
            if(cur == null)
                cur = new Node();

            addWords(cur,s);
            nodes[cnt] = cur;
        }

        for(int i = words.length;i>=0;i--){
            if(nodes[i] !=null){
                getWords(nodes[i],k);
                if(res.size() == k)
                    break;
            }
        }

        return res;

    }

    private void addWords(Node cur, String s) {

        for(char ch : s.toCharArray()){
            if(cur.next.get(ch) == null)
                cur.next.put(ch,new Node());

            cur = cur.next.get(ch);
        }

        cur.word = s;
    }


    private void getWords(Node cur,int k){
        if(res.size() == k)
            return;

        if(cur.word != null)
            res.add(cur.word);

        for(char ch : cur.next.keySet())
            getWords(cur.next.get(ch),k);
    }

}