package Dynamic_Programming;

public class CountSubsetsWithGivenDifference {
    public static void main(String[] args) {
        int []arr= {1,1,2,3};
        int n =arr.length;
        int diff =1;
        System.out.println(numberOfSubsets(arr,n,diff));
    }
    static int numberOfSubsets(int []arr, int n , int diff)
    {
       // make two subsets such that difference of the sum of both of them is equal to the difference given by the question
       //finding total sum of the array elements
       int sum =0;
       for(int i=0;i<n;i++)sum+=arr[i];
       // s1 + s2 = sum
        // s1 -s2 = diff
        // s1 = (sum + diff)/2;
        int s1 = (sum+diff)/2; // 7+1/2=4
        int [][]dp = new int [n+1][s1+1];
        for( int i=0;i<=n;i++)
        {
            for(int j=0;j<=s1;j++)
            {
                if(j==0)dp[i][j]=0;
                else if(i==0)dp[i][j]=1;
                else{
                    if(arr[i-1]<=j)
                        dp[i][j]=dp[i-1][j-arr[i-1]] + dp[i-1][j];
                    else
                        dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][s1];
    }
}
