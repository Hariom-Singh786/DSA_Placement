package Dynamic_Programming;
/*
* Coin Change Problem Minimum Numbers of coins
Given a value V, if we want to make change for V cents, and we have infinite supply of each of C = { C1, C2, .. , Cm}
* valued coins, what is the minimum number of coins to make the change?
Example:

Input: coins[] = {25, 10, 5}, V = 30
Output: Minimum 2 coins required
We can use one coin of 25 cents and one of 5 cents */

public class CoinChange_2 {
    public static void main(String[] args) {
        int []coins = {25,10,5};
        int sum = 30;
        int n = coins.length;
        System.out.println(minCoins(coins,sum,n));
    }
    static int minCoins(int []coins, int sum, int n)
    {
        int [][]dp = new int [n+1][sum+1];

        // base cases

        for(int i=0;i<=sum;i++)
        {
            dp[0][i]=Integer.MAX_VALUE-1;
        }
        for(int j=0;j<=n;j++)
        {
            dp[j][0]=0;
        }
        for(int i = 1;i<=sum;i++)
        {
            if(i%coins[0]==0)
            {
                dp[1][i]=i/coins[0];
            }
            else
            {
                dp[1][i]=Integer.MAX_VALUE-1;
            }
        }


        // main code

        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(coins[i-1]<=j)
                {
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
