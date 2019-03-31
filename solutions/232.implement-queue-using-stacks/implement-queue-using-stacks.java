class MyQueue {

    Stack<Integer> t;
    public MyQueue() {
        t = new Stack<Integer>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        t.push(x); 
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
         if(t.empty())  return 0;
         int sz = t.size() - 1;
         Stack<Integer> st = new Stack<Integer>();
         
         while(sz>0){
             st.push(t.pop());
             sz--;
         }
        
        int n = t.pop();
        
        while(!st.empty())
             t.push(st.pop());
        return n;
    }
    
    /** Get the front element. */
    public int peek() {
         if(t.empty())  return 0;
         int sz = t.size() - 1;
         Stack<Integer> st = new Stack<Integer>();
         
         while(sz>0){
             st.push(t.pop());
             sz--;
         }
        
        int n = t.pop();
        st.push(n);
        
        while(!st.empty())
             t.push(st.pop());

        return n;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return t.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */