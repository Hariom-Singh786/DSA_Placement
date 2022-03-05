package Dynamic_Programming;

import java.util.Arrays;

public class CountSubsetsWithSumK {
    public static void main(String[] args) {
        int [] arr= {0,0,1};
        int n = arr.length;
//        System.out.println(countSubsets(arr,n, 1));
//        System.out.println(tabulation(n,arr,10));
        System.out.println(countSubset(arr,n,1));
    }
    static int countSubsets(int []arr, int n, int k)
    {
        int [][]dp = new int[n][k+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return fun(n-1,arr,k,dp);
    }
    static int fun(int index, int[]arr, int k, int [][]dp)
    {
        // this works when in arr[] elements 0's are not considered
//        if(k==0)return 1;
//        if(index==0)
//        {
//            if(arr[index]==k) return 1;
//            else return 0;
//        }

        // this base case is when in arr[] elements 0's are too considered as elements
        if(index==0)
        {
            if(k==0 && arr[0]==0)return 2;
            if(k==0 || k==arr[0])return 1;
            return 0;
        }

        if(dp[index][k]!=-1)return dp[index][k];
        int notTake = fun(index-1, arr,k,dp);
        int take =0;
        if(arr[index]<=k)
        {
            take = fun(index-1,arr,k-arr[index],dp);
        }
        return dp[index][k]=take+notTake;
    }
    static int tabulation(int n, int[] arr,int k)
    {
        int [][]dp = new int [n][k+1];
        for(int i=0;i<n;i++)
        {
            dp[i][0]=1;
        }
        if(arr[0]<=k) dp[0][arr[0]]=1;
        for(int index =1;index<n;index++)
        {
            for(int target =0;target<=k;target++)
            {
                int notTake =dp[index-1][target];
                int take =0;
                if(arr[index]<=target) {
                    take = dp[index - 1][target - arr[index]];

                }
                dp[index][target]=take + notTake;
            }
        }
        return dp[n-1][k];
    }

    // another approach by Aditya verma
    static int countSubset(int []arr, int n , int sum)
    {
        int [][]dp = new int [n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j==0)dp[i][j]=0;
                else if(i==0)dp[i][j]=1;
                else
                {
                    if(arr[i-1]<=j)
                    {
                        dp[i][j]=dp[i-1][j-arr[i-1]] + dp[i-1][j];
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        return dp[n][sum];
    }
}
