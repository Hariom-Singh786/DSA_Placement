package Dynamic_Programming;
// 0 1 1 2 3 5 8
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
    // using tabulation but space optimization
        int n =7;
        int prev1=1;
        int prev2=0;
        for(int i=2;i<=n;i++)
        {
            int curr = prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        System.out.println(prev1);
    }
}

    // using tabulation
//    int n =7;
//    int []dp = new int[n+1];
//        dp[0]=0;
//                dp[1]=1;
//                for(int i=2;i<n;i++)
//        {
//        dp[i]=dp[i-1]+dp[i-2];
//        System.out.println(dp[i]+" : "+i+ " fibonacci");
//        }

//using memoization
//    public static void main(String[] args) {
//        int n=10;
//        int []dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        System.out.println(fibo(n,dp));
//    }
//    // this is a recursive approach with time complexity O(n) and space O(n+1)
//    static int fibo(int n, int []dp)
//    {
//        if(n<=1)
//        {
//            return n;
//        }
//        if(dp[n]!=-1)
//        {
//            return dp[n];
//        }
//        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
//    }