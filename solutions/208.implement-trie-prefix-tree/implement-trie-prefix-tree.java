class Trie {

    public  TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if(!cur.links.containsKey(ch))
                cur.links.put(ch, new TrieNode());

            cur = cur.links.get(ch);
        }

        cur.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        TrieNode t = startsWithPrefix(word);
        return t != null && t.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

        return startsWithPrefix(prefix) != null;
    }

    private  TrieNode startsWithPrefix(String prefix){

        TrieNode cur = root;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(!cur.links.containsKey(ch))
                return null;

            cur = cur.links.get(ch);
        }

        return cur;
    }
}


class TrieNode {

    public HashMap<Character,TrieNode> links;
    public  boolean isEnd;

    public TrieNode(){
        links = new HashMap<>();
    }
}