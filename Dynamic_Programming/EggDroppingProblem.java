package Dynamic_Programming;

/*Egg Dropping using Recursion
Problem statement: You are given N floor and K eggs. You have to minimize the number of times you have to drop the
 eggs to find the critical floor where critical floor means the floor beyond which eggs start to break. Assumptions of
  the problem:

If egg breaks at ith floor then it also breaks at all greater floors.
If egg does not break at ith floor then it does not break at all lower floors.
Unbroken egg can be used again.
Note: You have to find minimum trials required to find the critical floor not the critical floor.

Example:
Input:
    4
    2

    Output:
    Number of trials when number of eggs is 2 and number of floors is 4: 3*/

import java.util.Arrays;

public class EggDroppingProblem {
    public static void main(String[] args) {
        int egg = 4;
        int floor = 8;
        System.out.println(memoization(egg,floor));
    }
    static int memoization(int e, int f)
    {
        int [][]dp = new int[e+1][f+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return solve(e,f,dp);
    }
    static int solve(int e, int f, int [][]dp)
    {
        //base case
        if(e==1)return f;
        if(f==0 || f==1)return f;
        if(dp[e][f]!=-1)return dp[e][f];
        int mn = Integer.MAX_VALUE;
        for(int k = 1;k<=f;k++)
        {
            int temp = 1 + Math.max(solve(e-1,k-1,dp),solve(e,f-k,dp));
            if(temp<mn)
            {
                mn = temp;
            }
        }
        return dp[e][f]= mn;
    }
}
