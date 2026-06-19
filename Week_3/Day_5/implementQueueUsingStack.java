class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();

    public MyQueue() {
        
    }

    public void push(int x) {
        while(!st.isEmpty()){
            helper.add(st.pop());
        }
        st.push(x);
        while(!helper.isEmpty()){
            st.add(helper.pop());
        }
    }
    
    public int pop() {
        return st.pop();
               
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.isEmpty()) return true;
        else return false;
        
    }
}
