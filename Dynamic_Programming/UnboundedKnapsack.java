package Dynamic_Programming;

import java.util.Arrays;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int w = 50;
        System.out.println(topdown(wt, val, w));
    }

    //topdown approach
    static int topdown(int[] wt, int[] val, int w) {
        int n = wt.length;
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || w == 0) {
                    dp[i][j] = 0;
                } else {
                    if (wt[i - 1] <= j) {
                        dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        return dp[n][w];
    }
}
