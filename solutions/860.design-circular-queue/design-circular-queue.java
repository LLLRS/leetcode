class MyCircularQueue {

    private int len = 0;
    private final int[] nums;
    private int front = 0;
    private int rear = -1;
    
    public MyCircularQueue(int k) {

       nums = new int[k];
    }
    
    
    public boolean enQueue(int value) {
    	if(isFull())
    		return false;
    	
        rear = (rear + 1) % nums.length;
        nums[rear] = value;
        len++;
        return true;
    }
    
    
    public boolean deQueue() {
    	if(isEmpty())
    		return false;
    	
        front = (front + 1) % nums.length;
        len--;

    	return true;
    }
    

    public int Front() {
    	if(isEmpty())
    		return -1;
    	
    	return nums[front];
    }
    

    public int Rear() {
    	if(isEmpty())
    		return -1;
    	
    	return nums[rear];
    }
    
    
    public boolean isEmpty() {
        return len == 0;
    }
    

    public boolean isFull() {
    	return len == nums.length;
    }
}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */