class MinStack {

    private Stack<Integer> data = null;
    private Stack<Integer> min = null;

    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {


        if(min.empty() || x < min.peek())
            min.push(x);
        else
            min.push(min.peek());

        data.push(x);
    }

    public void pop() {
        if(!data.empty()){
            data.pop();
            min.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */