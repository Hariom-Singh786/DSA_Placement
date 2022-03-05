package Dynamic_Programming;

/*Longest Common Subsequence Problem solution using recursion
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.

For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.
*/

import java.util.Arrays;

public class LongestSubsequence {
    public static void main(String[] args) {
        String x = "workattech";
        String y = "branch";

        /*s1: "workattech"
s2: "branch"
Result: 4*/
        int n = x.length();
        int m = y.length();
        System.out.println(LCS(x, y, n, m));
        System.out.println(memoization(x,y,n,m));
        System.out.println(topDown(x,y,n,m));
    }
    // recursive solution
    static int LCS(String x, String y, int n, int m)
    {
        // base case
        if(n==0 || m==0)return 0;
        if(x.charAt(n-1)==y.charAt(m-1))
        {
            return 1 + LCS(x, y, n-1,m-1);
        }
        else
        {
            return Math.max(LCS(x,y,n-1,m),LCS(x,y,n,m-1));
        }
    }
    //memoization
    static int memoization(String x, String y, int n , int m)
    {
        int [][]dp = new int[n+1][m+1];
        for(int []row : dp)
        {
            Arrays.fill(row,-1);

        }
        return fun(x,y,n,m,dp);
    }
    static int fun(String x, String y, int n, int m, int [][]dp)
    {
        if(n==0 || m==0)return 0;
        if(dp[n][m]!=-1)return dp[n][m];
        int take=0,notTake=0;
        if(x.charAt(n-1)==y.charAt(m-1))
        {
           take= 1 + fun(x,y,n-1,m-1,dp);
        }
        else
        {
            notTake= Math.max(fun(x,y,n-1,m,dp),fun(x,y,n,m-1,dp));
        }
        return dp[n][m]=take + notTake;
    }
    // tabulation or bottom-up approach
    static int topDown(String x, String y, int m , int n)
    {
        int [][]dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)dp[i][j]=0;
                else
                {
                    if(x.charAt(i-1)==y.charAt(j-1))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
                    }
                }
            }
        }
        return dp[m][n];
    }
}
