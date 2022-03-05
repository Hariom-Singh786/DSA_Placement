package Dynamic_Programming;
/*Longest Repeating Subsequence
Given a string, print the longest repeating subsequence such that the two subsequence don’t have same string
 character at same position, i.e., any i’th character in the two subsequences shouldn’t have the same index in the
 original string.
Example:
Input: str = "aab"
Output: "a"
The two subsequence are 'a'(first) and 'a'
(second). Note that 'b' cannot be considered
as part of subsequence as it would be at same
index in both.*/

public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
//        String str = "AABEBCDD";
        String str = "aab";
        System.out.println(topdown(str));
    }
    static int topdown(String str)
    {
        String a,b;
        a=b=str;
        int m =a.length();
        int n =b.length();
        int [][]dp =new int [m+1][n+1];

        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    if(a.charAt(i-1)==b.charAt(j-1) && i != j)
                    {
                        dp[i][j]=dp[i-1][j-1] +1;
                    }
                    else
                    {
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return dp[m][n];
    }
}
