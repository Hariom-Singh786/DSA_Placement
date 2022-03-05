package Dynamic_Programming;

import java.util.Arrays;

public class ShortestCommonSuperSequence {
    public static void main(String[] args) {
        // longest common subsequence type
        String a= "AGGTAB";
        String b ="GXTXAYB";
        int m = a.length();
        int n = b.length();
        System.out.println(superSequence(a,b,m,n));
        System.out.println(memoization(a,b,m,n));
    }
    static int superSequence(String a, String b, int m, int n)
    {
        return m + n - fun(a,b,m,n);
    }
    // this is topdown approach
    static int fun(String a, String b, int m, int n)
    {
        int [][]dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else{
                    if(a.charAt(i-1)==b.charAt(j-1))
                    {
                        dp[i][j]=1 + dp[i-1][j-1];
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

    // memoization solution
    static int memoization(String a, String b, int m, int n)
    {
        int [][]dp =  new int[m+1][n+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return m+n-memo(a,b,m,n,dp);
    }
    static int memo(String a, String b, int m, int n, int [][]dp)
    {
        if(m==0 || n==0)return 0;
        if(dp[m][n]!=-1)return dp[m][n];
        int take =0,notTake=0;
        if(a.charAt(m-1)==b.charAt(n-1))
        {
            take = 1+memo(a,b,m-1,n-1,dp);
        }
        else
        {
            notTake=Math.max(memo(a,b,m-1,n,dp),memo(a,b,m,n-1,dp));
        }
        return dp[m][n]=Math.max(take,notTake);
    }
}
