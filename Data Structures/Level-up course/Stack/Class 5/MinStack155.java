// https://leetcode.com/problems/min-stack/

class MinStack {

    /** initialize your data structure here. */
    Stack<Long> st = new Stack<>();
    long globalMin=0;
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        long val = x;
        if(st.size()==0){
            st.push(val);
            globalMin = val;
            return;
        }
        
        if(val < globalMin){
            st.push((val - globalMin)+val);
            globalMin = val;
        }
        else{
            st.push(val);
        }
        
    }
    
    public void pop() {
        if(st.peek() < globalMin){
            globalMin = (globalMin-st.peek())+globalMin;
        }            
        st.pop();
    }
    
    public int top() {
        if(st.peek() < globalMin) return (int)globalMin;
        
        return (int)((long)st.peek());
    }
    
    public int getMin() {
        return (int)globalMin;
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