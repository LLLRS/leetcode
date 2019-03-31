class MyHashSet {

    private int bucketSum;
    private boolean[][] bucket;
    public MyHashSet() {
        bucketSum = 1000;
        bucket = new boolean[bucketSum][];
        
    }
    
    public void add(int key) {
        int hash = hash(key);
        if(bucket[hash] == null)
            bucket[hash] = new boolean[bucketSum + 1];
        
        bucket[hash][post(key)] = true;
    }
    
    public void remove(int key) {
        
        int hash = hash(key);
        if(bucket[hash] != null)
            bucket[hash][post(key)] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = hash(key);
        
        return bucket[hash] != null && bucket[hash][post(key)];
    }
    
    private int hash(int key){
        return key % bucketSum;
    }
    
    private int post(int key){
        return key / bucketSum;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */