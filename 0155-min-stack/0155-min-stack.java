class MinStack {

    Stack <Long> st=new Stack <> ();
    long min;

    public MinStack() {
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        long value=val;
        if(st.isEmpty()){
            st.push(value);
            min=value;
        }
        else{
            if(value>=min){
                st.push(value);
            }
            else{
                st.push((2*value)-min);
                min=value;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        long a=st.peek();
        st.pop();
        if(a<min){
            min=(2*min)-a;
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        long a=st.peek();
        if(a>=min){
            return (int) a;
        }
        else{
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */