package Dynamic_Programming;

public class EqualSumPartition {
    public static void main(String[] args) {
        int []arr= {2,3,3,3,4,5};
        int n = arr.length;
        System.out.println(equalSum(arr,n));
    }
    static boolean equalSum(int []arr, int n)
    {
        int sum =0;
        for(int i=0;i<n;i++)sum+=arr[i];
        if(sum%2!=0)return false;
        else{
            int k = sum/2;
            return fun(arr,n,k);
        }
    }
    static boolean fun(int []arr, int n , int sum)
    {
        boolean [][]dp = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j==0)dp[i][j]=false;
                else if(i==0)dp[i][j]=true;
                else{
                    if(j-arr[i-1]>=0)
                        dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                    else
                        dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
