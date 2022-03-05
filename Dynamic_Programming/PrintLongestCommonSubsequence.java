package Dynamic_Programming;

/*Printing Longest Common Subsequence
Given two sequences, print the longest subsequence present in both of them.
Example:
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
*/


public class PrintLongestCommonSubsequence {
    public static void main(String[] args) {
        String x = "ABCDGH";
        String y = "AEDFHR";
        int m = x.length();
        int n = y.length();
        System.out.println(topDown(x,y,m,n));
    }
    static String topDown(String x, String y, int m, int n)
    {
        int [][]dp = new int [m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    if(x.charAt(i-1)==y.charAt(j-1))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                    }
                }
            }
        }
        int i=m,j=n;
        StringBuilder str = new StringBuilder();
        while(i>0 && j>0)
        {
            if(x.charAt(i-1)==y.charAt(j-1))
            {
                str.append(x.charAt(i - 1));
                i--;
                j--;
            }
            else
            {
                if(dp[i][j-1]>dp[i-1][j])
                    j--;
                else
                    i--;
            }
        }
        str.reverse();
        return str.toString();
    }
}
