package Dynamic_Programming;

import java.util.Arrays;

public class WaysToMakeCoinChange {
    public static void main(String[] args) {
        int [] denomination ={1,2,3};
        System.out.println(countWaysToMakeChange(denomination,4));
    }
    public static long countWaysToMakeChange(int denominations[], int value){
        int n = denominations.length;
        long [][]dp = new long[n][value+1];
        for(long []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return fun(n-1,value,denominations,dp);
    }
    static long fun(int index, int target, int []arr,long[][]dp)
    {
        //base case
        if(index==0)
        {
           if(target%arr[0]==0)return 1;
           return 0;
        }
        if(dp[index][target]!=-1)return dp[index][target];
        long notTake = fun(index-1,target,arr,dp);
        long take =0;
        if(arr[index]<=target)
        {
            take = fun(index, target-arr[index],arr,dp);
        }
        return dp[index][target]=take + notTake;
    }
}
