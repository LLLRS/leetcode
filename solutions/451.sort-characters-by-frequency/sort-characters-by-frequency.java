class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Node> h = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            Node t = h.getOrDefault(ch,new Node(ch));
            t.cnt++;

            h.put(ch,t);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> b.cnt - a.cnt);
        for(char t : h.keySet())
            pq.add(h.get(t));

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            Node t = pq.poll();
            sb.append(contact(t.c,t.cnt));
        }

        return sb.toString();
    }

    private String contact(char ch,int n){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++)
            sb.append(ch);

        return sb.toString();
    }
}

class Node{
    public char c;
    public int cnt;

    public Node(char c){
        this.c = c;
        this.cnt = 0;
    }
}