class MyStack {

    
    Queue<Integer> t;
    public MyStack() {
        
        t = new LinkedList<Integer>();   
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        t.add(x);   
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
         if(t.isEmpty()) return 0;
        
         Queue<Integer> st = new LinkedList<Integer>();
         int sz = t.size() - 1;
         for(int i=0;i<sz;i++)
             st.add(t.poll());
        
        int n = t.poll();
        t = st;
        return n;
    }
    
    /** Get the top element. */
    public int top() {
        if(t.isEmpty()) return 0;
        
        Queue<Integer> st = new LinkedList<Integer>();
         int sz = t.size() - 1;
         for(int i=0;i<sz;i++)
             st.add(t.poll());
        
        int n = t.poll();
        st.add(n);
        t = st;
        return n;
    }
    
    public boolean empty() {
        return t.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */