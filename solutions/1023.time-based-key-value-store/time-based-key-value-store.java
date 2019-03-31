public class TimeMap {

    private HashMap<String, TreeMap<Integer,String>> hm = null;
    public TimeMap() {
        hm = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer,String> ts = hm.getOrDefault(key,new TreeMap<Integer,String>());
        ts.put(timestamp,value);
        hm.put(key,ts);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer,String> ts = hm.get(key);
        if(ts == null) return "";

        if(ts.containsKey(timestamp))
            return ts.get(timestamp);

        Integer low = ts.lowerKey(timestamp);
        if(low != null)
            return ts.get(low);
       
        return "";
    }
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */