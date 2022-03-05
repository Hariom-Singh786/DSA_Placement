package Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubsetSumDiff {
    public static void main(String[] args)
    {
        int []arr= { 1,2,3,4,5};
        int n = arr.length;
        System.out.println(partition(arr,n));
    }
    static int partition(int []arr, int n)
    {
        int sum =0;
        for(int i=0;i<n;i++)sum+=arr[i];
        boolean [][]dp = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j==0)dp[i][j]=false;
                else if(i==0)dp[i][j]=true;
                else {
                    if(arr[i-1]<=j)
                    {
                        dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
       int mn = Integer.MAX_VALUE;
        for(int i=sum/2;i>=0;i--)
        {
            if(dp[n][i]) // means true
            {
                mn = Math.min(mn,sum-2*i);
            }
        }
        return mn;
    }
}
