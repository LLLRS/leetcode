class MagicDictionary {

    class Node {
        public Node[] next = new Node[26];
        public String w;
    }


    private Node root;
    public MagicDictionary() {
        root = new Node();
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String w : dict)
            root = put(w,root,0);

    }

    private Node put(String w, Node x, int d){
        if(x == null)
            x = new Node();
        if(d == w.length()) {
            x.w = w;
            return x;
        }

        int c = w.charAt(d) - 'a';
        x.next[c] = put(w,x.next[c],d+1);

        return x;
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {

        return get(word,root,0,false);
    }


    private boolean get(String w,Node x,int d ,boolean flag){

        if( x == null)
            return false;

        if(d < w.length()){
            int c = w.charAt(d) - 'a';
            if(x.next[c] != null){
                if(get(w,x.next[c],d+1,flag))
                    return true;
            }

            if(!flag){
                for(int i = 0;i<26;i++){
                    if(i != c  && get(w,x.next[i],d+1,true))
                        return true;
                }
            }
            
            return false;
        }

        return flag && x.w != null;
    }
}