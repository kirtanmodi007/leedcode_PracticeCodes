class Solution 
{
    public String minRemoveToMakeValid(String s) 
    {
        
        //OVERALL TIME COMPLEXITY = O(N)
        //OVERALL SPACE COMPLEXITY = O(N) ITS A BETTER SPACE SOLUTION COMPARE TO OTHER
        //NOW IMPLEMENT THE TWO PARSE SOLUTION
        
        //PARSE 1: REMOVE ALL UNNECESSARY ')' BRACKETS.
        
        StringBuilder sb1 = new StringBuilder();
        
        int openBrackets = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                openBrackets++;
            }
            else if(s.charAt(i) == ')')
            {
                //Jo closing aayo but aeni pahela openning aayo j na hoy to aene ahi ignore karwo j pade.
                if(openBrackets==0)
                {
                    continue;
                }
                else
                {
                    openBrackets--;
                }
            }
            
            //In either of the case tare characters append to karawana j 6e.
            sb1.append(s.charAt(i));
        }
        
        //But what if we have access Opening Brackets '('.
        
        //Now we need to loop through backwards and remove those extra Opening Brackets.
        StringBuilder finalString = new StringBuilder();
        
        for(int i = sb1.length() - 1; i > -1; i --)
        {
            if(sb1.charAt(i) == '(' && openBrackets > 0)
            {
                openBrackets--;
                continue;
            }
            finalString.append(sb1.charAt(i));
        }
        
        return finalString.reverse().toString();
    }
}
