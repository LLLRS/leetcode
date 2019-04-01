class LRUCache extends LinkedHashMap<Integer,Integer> {

    private int cap;
    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.cap = capacity;

    }

    public int get(int key) {
        Integer t = super.get(key);
        return t == null ? -1 : t;
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return super.size() > cap;
    }
}