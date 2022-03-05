package Dynamic_Programming;


/*A thief is robbing a store and can carry a maximal weight of W into his knapsack.
 There are N items and the ith item weighs wi and is of value vi.
 Considering the constraints of the maximum weight that a knapsack can carry,
 you have to find and return the maximum value that a thief can generate by stealing items.*/

import java.util.Arrays;

//constraints
/*1 <= T <= 10
1 <= N <= 10^2
1<= wi <= 50
1 <= vi <= 10^2
1 <= W <= 10^3*/
public class ZeroOneKnapsack {
    public static void main(String[] args) {

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int w = 50;
        System.out.println(maxProfit(wt,val,w));
        System.out.println(topdown(wt,val,w));

    }
    static int maxProfit(int []wt, int []val, int w)
    {
        int n =wt.length;
        int [][]dp = new int[n][w+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return fun(wt,val,w,n-1,dp);
    }
    static int fun(int []wt, int[] val,int w, int index, int [][]dp)
    {
        //base case
        if(index==0)
        {
            if(wt[index]<=w) return val[0];
            return 0;
        }
        if(dp[index][w]!=-1)return dp[index][w];
        int notTake = fun(wt,val,w,index-1,dp);
        int take = Integer.MAX_VALUE;
        if(wt[index]<=w)
        {
            take = val[index] + fun(wt,val,w-wt[index],index-1,dp);
        }
        return dp[index][w]= Math.max(take,notTake);
    }
    //0-1 knapsack topdown approach
    static int topdown(int []wt, int []val, int w)
    {
        int n = wt.length;
        int [][]dp = new int[n+1][w+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(i==0 || w==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    if(wt[i-1]<=j)
                    {
                        dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                    }else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        return dp[n][w];
    }
}
