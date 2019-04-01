public class MyHashMap {

    private int bucketSum;
    private ListNode[] bucket;
    public MyHashMap() {
        bucketSum = 10000;
        bucket = new ListNode[bucketSum];
    }


    public void put(int key, int value) {
        int h = hash(key);
        if(bucket[h] == null)
            bucket[h] = new ListNode(key,value);
        else if(bucket[h].key == key)
            bucket[h].value = value;
        else{
            ListNode pre = find(bucket[h],key);
            if(pre.next == null)
                pre.next = new ListNode(key,value);
            else
                pre.next.value = value;
        }

    }
    public int get(int key) {

        int h = hash(key);
        if(bucket[h] == null)
            return -1;
        else if(bucket[h].key == key)
            return bucket[h].value;
        else{
            ListNode pre = find(bucket[h],key);
            if(pre.next == null)
                return  -1;
            else
                return  pre.next.value;
        }
    }

    public void remove(int key) {
        int h = hash(key);

        if (bucket[h] == null)
            return;
        else if (bucket[h].key == key)
            bucket[h] = bucket[h].next;
        else {
            ListNode pre = find(bucket[h], key);
            if (pre.next == null)
                return;
            else
                pre.next = pre.next.next;
        }

    }

    private ListNode find(ListNode head,int key){
        ListNode pre = null;

        while(head != null && head.key != key){
            pre = head;
            head =head.next;
        }

        return pre;
    }


    private int hash(int key){
        return key % bucketSum;
    }

    class ListNode {

        public int key;
        public int value;
        public ListNode next;

        public ListNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */