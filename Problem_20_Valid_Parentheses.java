class Solution
{
    public boolean isValid(String s) 
    {
        //We can solve this question using Stack.
        
      Stack<Character> myStack = new Stack<Character>();
            
            //In order to loop through string one must use toCharArray function.
            
            for(char c:s.toCharArray())
            {
                if(c == '[' || c == '{' || c == '(')
                {
                    myStack.push(c);
                }
                
                else if(c == '}' && !myStack.isEmpty() && myStack.peek()=='{')
                {
                    myStack.pop();                    
                }
                
                else if(c==']' && !myStack.isEmpty() && myStack.peek() == '[')
                {
                    myStack.pop();
                }
                
                else if(c==')' && !myStack.isEmpty() && myStack.peek() == '(')
                {
                    myStack.pop();
                }
                
                else
                {
                    return false;
                }
            }
        
        return myStack.isEmpty();
        
    }
}
