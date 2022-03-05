package Dynamic_Programming;

import java.util.Arrays;

/*Coin Change Problem Maximum Number of ways
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm}
 valued coins, how many ways can we make the change? The order of coins doesn’t matter.
Example:
for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.*/
public class CoinChange {
    public static void main(String[] args) {
        int [] arr= {5, 2, 4};
        int m = arr.length;
        System.out.println(memoization(arr,m,13));
        System.out.println(topdown(arr,m,13));
    }
    static int  memoization(int []arr, int m, int n)
    {
        int [][]dp = new int[m+1][n+1];
        for(int []row: dp)
        {
            Arrays.fill(row,-1);
        }
        return maxWays(arr, m,n,dp);
    }
    // recursive solution
    static int maxWays(int []arr, int m , int n, int [][]dp)
    {
        // base case when  sum ->n is zero return 1
        if(n==0)
        {
            return 1;
        }

        if(m<=0 && n >= 1 || n < 0)
        {
            return 0;
        }
        if(dp[m][n]!=-1)return dp[m][n];
        return dp[m][n]=maxWays(arr, m,n-arr[m-1],dp) + maxWays(arr,m-1,n,dp);
    }

    //topdown approach -> it's wrong code
    static int topdown(int[]coins,int n, int w) {
        int[][] dp = new int[n + 1][w + 1];
        // base case when  sum ->n is zero return 1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || w == 0) {
                    dp[i][j] = 0;
                } else {
                    if (coins[i - 1] <= j) {
                        dp[i][j] = Math.max(coins[i - 1] + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        return dp[n][w];
    }
}
