package Dynamic_Programming;

/*Rod Cutting Problem
 Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n.
 Determine the  maximum value obtainable by cutting up the rod and selling the pieces.
Example:
if length of the rod is 8 and the values of different pieces are given as following,
then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)*/
public class RodCutting {
    public static void main(String[] args) {
        int []arr= {1, 5, 8, 9, 10, 17, 17, 20};
        int n = arr.length;
        int []len= new int [n];
        for(int i=0;i<n;i++)
        {
            len[i]=i+1;
        }
        System.out.println(maxProfit(arr,len,n));
    }
    static int maxProfit(int []price, int []len,int n)
    {
        int l = len.length;
        int[][] dp = new int[n + 1][l + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= l; j++) {
                if (i == 0 || l == 0) {
                    dp[i][j] = 0;
                } else {
                    if (len[i - 1] <= j) {
                        dp[i][j] = Math.max(price[i - 1] + dp[i][j - len[i - 1]], dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        return dp[n][l];
    }
}
