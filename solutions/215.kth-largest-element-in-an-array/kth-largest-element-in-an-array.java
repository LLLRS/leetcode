class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int n = nums.length;
        for(int t : nums){
            if( pq.size() < k){
                pq.add(t);
            }else if( pq.peek() < t){
                pq.poll();
                pq.add(t);
            }
        }
        
        return pq.peek();
    }
}