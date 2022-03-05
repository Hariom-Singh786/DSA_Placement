package Dynamic_Programming;

import java.util.Arrays;
/*You are given an array ‘ARR’ of ‘N’ integers and a target number, ‘TARGET’.
 Your task is to build an expression out of an array by adding one of the symbols '+' and '-' before each integer
 in an array, and then by concatenating all the integers, you want to achieve a target.
 You have to return the number of ways the target can be achieved.*/

public class TargetSum {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 1};
        System.out.println(countPartitions(arr.length,3,arr));
    }
    public static int countPartitions(int n, int d, int[] arr) {
        int totSum=0;
        for(int i=0;i<n;i++)
        {
            totSum+=arr[i];
        }

        if(totSum-d < 0 || (totSum-d)%2==1)return 0;
        return findWays(arr,(totSum-d)/2);

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
        return dp[index][k]=take+notTake;
    }
}

