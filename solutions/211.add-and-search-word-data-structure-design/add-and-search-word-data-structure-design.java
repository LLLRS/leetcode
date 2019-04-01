class TrieNode {

    public HashMap<Character,TrieNode> links;
    public  boolean isEnd;

    public TrieNode(){
        links = new HashMap<>();
    }
}

class WordDictionary {

    private TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if(!cur.links.containsKey(ch))
                cur.links.put(ch, new TrieNode());

            cur = cur.links.get(ch);
        }

        cur.isEnd = true;
    }

    /** Returns if the word is in the data structure.
     *  A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {

        return search(root,0,word);
    }

    private boolean search(TrieNode nt,int k,String word){
        if(word.length() == k)
            return nt.isEnd;

        char ch = word.charAt(k);
        HashMap<Character,TrieNode> tn = nt.links;
        if( ch != '.'){
            return tn.containsKey(ch) && search(tn.get(ch),k+1,word);
        }else{
            for(char ct : tn.keySet()){
                if(search(tn.get(ct),k+1,word))
                    return true;
            }
        }

        return false;
    }
}

