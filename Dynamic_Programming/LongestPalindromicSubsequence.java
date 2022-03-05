package Dynamic_Programming;

/*Longest Palindromic Subsequence
Given a sequence, find the length of the longest palindromic subsequence in it.
Example :
Input:"bbbab"
Output:4*/

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s ="bbbab";
        int m = s.length();
        System.out.println(topdown(s,m));
    }
    static int topdown(String s,int m)
    {
        StringBuilder revStr= new StringBuilder(s);

        revStr=revStr.reverse();
        int n = revStr.length();
        int [][]dp = new int[m+1][n+1];
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
                    if(s.charAt(i-1)==revStr.charAt(j-1))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return dp[m][n];
    }
}
