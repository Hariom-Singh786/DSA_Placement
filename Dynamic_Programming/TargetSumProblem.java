package Dynamic_Programming;

/*
* You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and
*  then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the
*  expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.*/

public class TargetSumProblem {
    public static void main(String[] args) {
        int []arr= {1,1,2,3};
        int diff=1;
        System.out.println(findTargetSumWays(arr,diff));
    }
    static int findTargetSumWays(int[] nums, int target) {
        int sum =0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int diff = (sum+target)/2;
        if( sum < target|| sum + target < 0 ||  (sum  + target) %2 != 0 )
            return 0;

        return fun(nums,diff);

    }
    static int fun(int []arr, int diff)
    {

        int n = arr.length;
        int mod = (int)Math.pow(10,9)+7;
        int [][]dp = new int [n+1][diff+1];
        //  // Initializing the first value of matrix
        // dp[0][0] = 1;
        // for (int i = 1; i <= diff; i++)
        //     dp[0][i] = 0;
        // for (int i = 1; i <= n; i++)
        //     dp[i][0] = 1;
        dp[0][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=diff;j++)
            {

                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        return dp[n][diff]%mod;
    }
}
