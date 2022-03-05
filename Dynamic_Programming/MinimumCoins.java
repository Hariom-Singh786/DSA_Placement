package Dynamic_Programming;

import javax.xml.stream.XMLInputFactory;
import java.util.*;

/*
* You are given an array of ‘N’ distinct integers and an integer ‘X’ representing the target sum.
*  You have to tell the minimum number of elements you have to take to reach the target sum ‘X’.
* */
public class MinimumCoins {
    static int maxi = (int)Math.pow(10,9);
    public static void main(String[] args) {
        int []arr= {1,2,3,4};
        int target = 9;
//        System.out.println(minCoins(arr,target));
        System.out.println(tabulation(arr,target));
    }
    static int minCoins(int []arr, int target)
    {
        int n = arr.length;
        int [][]dp = new int[n][target+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        int ans = fun(n-1,target,arr,dp);
        if(ans >=maxi)return -1;
        return ans;
    }
    static int fun(int index, int target, int []arr, int [][]dp)
    {
        if(index==0)
        {
            if(target%arr[0]==0)
                return target/arr[0];
            return maxi;
        }
        if(dp[index][target]!=-1)return dp[index][target];
        int notTake = fun(index-1,target,arr,dp);
        int take = Integer.MAX_VALUE;
        if(arr[index]<=target)
        {
            take = 1+fun(index,target-arr[index],arr,dp);
        }
        return dp[index][target]=Math.min(notTake,take);
    }
    static int tabulation(int []arr,int target)
    {
        int n = arr.length;
        int [][]dp = new int [n][target+1];
        for(int T=0;T<=target;T++)
        {
            if(T%arr[0]==0)
            {
                dp[0][T]=T/arr[0];
            }else
            {
                dp[0][T]=maxi;
            }
        }

        for(int ind = 1; ind < n;ind++)
        {
            for(int T =0;T<=target;T++)
            {
                int notTake = dp[ind-1][T];
                int take = Integer.MAX_VALUE;
                if(arr[ind]<=T)
                {
                    take = 1 + dp[ind-1][T-arr[ind]];
                }
                dp[ind][T]=Math.min(take,notTake);
            }
        }
        int ans = dp[n-1][target];
        if(ans>=maxi)return -1;
        return ans;
    }
}
