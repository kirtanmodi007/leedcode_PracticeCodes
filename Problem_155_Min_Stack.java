class MinStack {

    /** initialize your data structure here. */
    
    Stack<Integer> myStack = new Stack<Integer>();
    
    
    public void push(int x) 
    {
        myStack.push(x);
        
    }
    
    public void pop() 
    {
        myStack.pop();
    }
    
    public int top() 
    {
          return myStack.peek();      
    }
    
    public int getMin() 
    {
        int min = myStack.peek();
        for(Integer item:myStack)
        {
            if (item < min )
            {
                min = item;
            }
        }
        
        return min;
        
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
