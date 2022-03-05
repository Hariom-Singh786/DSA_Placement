package Dynamic_Programming;

import java.util.Arrays;

// given two strings
// a = "AXY"
// b ="ADXCPY"
// return true or false of if a string is exactly present in string b
public class SequencePatternMatching {
    public static void main(String[] args) {
        String  a= "AXY";
        String b = "ADXCPY";
        int m =a.length();
        int n =b.length();
        System.out.println(memoization(a,b,m,n));
        System.out.println(topdown(a,b,m,n));
    }
    static boolean memoization(String a, String b, int m, int n)
    {
        int [][]dp = new int[m+1][n+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return m == fun(a,b,m,n,dp);
    }
    static int fun(String a, String b, int m, int n, int [][]dp)
    {
        if(m==0 || n==0)return 0;
        if(dp[m][n]!=-1)return dp[m][n];
        int take=0;
        int notTake=0;
        if(a.charAt(m-1)==b.charAt(n-1))
        {
            take = 1 + fun(a,b,m-1,n-1,dp);
        }
        else
        {
            notTake= Math.max(fun(a,b,m-1,n,dp),fun(a,b,m,n-1,dp));
        }
        return dp[m][n]= Math.max(take, notTake);
    }

    // topdown
    static boolean topdown(String a, String b, int m, int n)
    {
        int [][]dp = new int [m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;

                }else
                {
                    if(a.charAt(i-1)==b.charAt(j-1))
                    {
                        dp[i][j]=1 + dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return  m==dp[m][n];
    }
}
