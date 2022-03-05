package Dynamic_Programming;

import java.util.Arrays;

public class CountPartitionsWithGivenDiff {
    public static void main(String[] args) {
        //If N = 4, D = 3, ARR = {5, 2, 5, 1}
        int []arr= {5,2,5,1};
        int n= arr.length;
        System.out.println(countPartitions(n,3,arr));

    }
    public static int countPartitions(int n, int d, int[] arr) {
        int totSum=0;
        for(int i=0;i<n;i++)
        {
            totSum+=arr[i];
        }

        if(totSum-d < 0 || (totSum-d)%2==1)return 0;
//        return findWays(arr,(totSum-d)/2);
        return tabulation(n,arr,(totSum-d)/2);
    }
    public static int findWays(int num[], int tar) {
        int n = num.length;
        int [][]dp = new int[n][tar+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return fun(n-1,num,tar,dp);
    }
    static int fun(int index, int []arr, int k , int [][]dp)
    {
        int mod = (int)Math.pow(10,9)+7;
        if(index==0)
        {
            if(k==0 && arr[0]==0)return 2;
            if(k==0 || k==arr[0])return 1;
            return 0;
        }
        if(dp[index][k]!=-1) return dp[index][k];
        int notTake = fun(index-1,arr,k,dp);
        int take =0;
        if(arr[index]<=k)
        {
            take = fun(index-1,arr,k-arr[index],dp);
        }
        return dp[index][k]=(take+notTake)%mod;
    }
    static int tabulation(int n, int[] arr,int k)
    {
        int [][]dp = new int [n][k+1];
        //if element at which index is pointing is also zero then
       if(arr[0]==0)dp[0][0]=2; // dp[0][0]-> means at index 0 the sum is also 0
       //if element at which index is pointing is not zero but target value has become zero or achieved
       else dp[0][0]=1;
       //if index 0 value of array is not zero and is less than or equal of target value then putting it 1
       if(arr[0]!=0 && arr[0]<=k)
           dp[0][arr[0]]=1;
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
}
