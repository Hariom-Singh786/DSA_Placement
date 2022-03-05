package Dynamic_Programming;

public class PartitionSetIntoTwoSubsetsMinSum {
    public static void main(String[] args) {
        int []arr={1,5,3,4,6,21};
        int n = arr.length;
        System.out.println(minSubsetSumDifference(arr,n));
    }
    public static int minSubsetSumDifference(int[] arr, int n) {
        int totsum=0;
        for(int i=0;i<n;i++)totsum+=arr[i];
        int k=totsum;
        boolean [][]dp = new boolean[n][k+1];
        for(int i=0;i<n;i++)dp[i][0]=true;
        if(arr[0]<=k)dp[0][arr[0]]=true;
        for(int ind =1;ind<n;ind++)
        {
            for(int target=1;target<=k;target++)
            {
                boolean notTake =dp[ind-1][target];
                boolean take = false;
                if(arr[ind]<=target)
                    take = dp[ind-1][target-arr[ind]];
                dp[ind][target]=take ||notTake;
            }
        }

        int mini= (int)Math.pow(10,9);
        for(int s1=0;s1<=totsum/2;s1++)
        {
            if(dp[n-1][s1]==true)
            {
                mini= Math.min(mini,Math.abs((totsum-s1) - s1));
            }
        }
        return mini;
    }
}
