package Dynamic_Programming;

/*Matrix Chain Multiplication using Recursion
 Given a sequence of matrices, find the most efficient way to multiply these matrices together.
 The problem is not actually to  perform the multiplications, but merely to decide in which order to perform the
  multiplications.
*/

import java.util.Arrays;

// MCM - > Very important concept
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int []arr= {10, 20, 30, 40, 30};
        //recursive solution
        System.out.println(solve(arr,1,arr.length-1));
        //bottom-up or memoization
        System.out.println(memoization(arr));
    }
    //recursive solution
    static int solve(int []arr, int i, int j)
    {
        //base case
        if(i>=j)return 0;
        int mn = Integer.MAX_VALUE;
        for(int k =i;k<=j-1;k++)
        {
            int temp = solve(arr,i,k) + solve(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
            if(temp<mn)
            {
                mn =temp;
            }
        }
        return mn;
    }

    // memoization or bottom-up approach
    static int memoization(int []arr)
    {
        int n = arr.length;
        int [][]dp = new int[n+1][n+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return solution(arr,1,n-1,dp);
    }
    static int solution(int []arr,int i, int j,int [][]dp)
    {
        if(i>=j)return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int mn =Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int temp = solution(arr,i,k,dp)+solution(arr,k+1,j,dp)+arr[i-1]*arr[k]*arr[j];
            if(temp<mn)
            {
                mn =temp;
            }
        }
        return dp[i][j]=mn;
    }
}
