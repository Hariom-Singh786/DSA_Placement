package Dynamic_Programming;
/*Evaluate Expression To True-Boolean Parenthesization Recursion
Given a boolean expression with following symbols.
Symbols
    'T' --- true
    'F' --- false
And following operators filled between symbols
Operators
    &   ---boolean AND
    |   --- boolean OR
    ^   --- boolean XOR
Count the number of ways we can parenthesize the expression so that the value of expression evaluates to true.
Example:
Input: symbol[]    = {T, F, T}
       operator[]  = {^, &}
Output: 2
The given expression is "T ^ F & T", it evaluates true
in two ways "((T ^ F) & T)" and "(T ^ (F & T))"*/

public class ParenthesisCount {
    public static void main(String[] args) {
        String s = "T^F&T";
        int isTrue=1;
        System.out.println(fun(s,0,s.length()-1,isTrue));
    }
    static int fun(String s, int i, int j, int isTrue)
    {
        if(i>j)return 0;
        if(i==j)
        {
            if(isTrue==1)
            {
                return (s.charAt(i)=='T')?1:0;
            }
            else{
                return (s.charAt(i)=='F')?1:0;
            }
        }
        int ans=0;
        int lt,lf,rt,rf;
        for(int k=i+1;k<=j-1;k+=2)
        {
            lt = fun(s,i,k-1,1);
            lf=fun(s,i,k-1,0);
            rt=fun(s,k+1,j,1);
            rf=fun(s,k+1,j,0);

            // checking operators
            if(s.charAt(k)=='&')
            {
                if(isTrue==1) // if it will return true
                {
                    ans+=lt*rt;
                }else // if it will return false
                {
                    ans+=lf*rt+lt*rf+rf*lf;
                }
            }
            else if(s.charAt(k)=='|')
            {
                if(isTrue==1)// if it will return true
                {
                    ans+=lf*rt+lt*rt+lt*rf;
                }else // if it will return false
                {
                    ans+=lf*rf;
                }
            }
            else if(s.charAt(k)=='^')
            {
                if(isTrue==1) // if it will return true
                {
                    ans+=lt*rf+lf*rt;
                }
                else // if it will return false
                {
                    ans+=lt*rt+lf*rf;
                }
            }
        }
        return ans;
    }
}
