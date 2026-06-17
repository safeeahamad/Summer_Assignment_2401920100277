class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minst=new Stack<>();

    public MinStack() {
        
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()) minst.push(val);
        else if(!minst.isEmpty() && val<minst.peek()) minst.push(val);
        else minst.push(minst.peek());
        
    }
    
    public void pop() {
        st.pop();
        minst.pop();
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minst.peek();
        
    }
}
