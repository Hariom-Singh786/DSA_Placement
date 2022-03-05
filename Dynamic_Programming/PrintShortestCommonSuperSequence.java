package Dynamic_Programming;

/*Given two strings X and Y, print the shortest string that has both X and Y as subsequences.
If multiple shortest supersequence exists, print any one of them.

Examples:

Input: X = "AGGTAB",  Y = "GXTXAYB"
Output: "AGXGTXAYB" OR "AGGXTXAYB"
OR Any string that represents shortest
supersequence of X and Y

Input: X = "HELLO",  Y = "GEEK"
Output: "GEHEKLLO" OR "GHEEKLLO"
OR Any string that represents shortest
supersequence of X and Y*/
public class PrintShortestCommonSuperSequence {
    public static void main(String[] args) {
        String str1 ="AGGTAB";
        String str2= "GXTXAYB";
        int m = str1.length();
        int n =str2.length();
        System.out.println(topdown(str1,str2,m,n));
    }
    static String topdown(String str1,String str2, int m, int n)
    {
        int [][]dp = new int [m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else{
                    if(str1.charAt(i-1)==str2.charAt(j-1))
                        dp[i][j]=1+dp[i-1][j-1];
                    else
                        dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        // now I have obtained LCS
        int i= m, j=n;
        StringBuilder str = new StringBuilder();
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1)) {
                str.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i][j-1]>dp[i-1][j])
                {
                    str.append(str2.charAt(j-1));
                    j--;
                }
                else if(dp[i-1][j]>dp[i][j-1])
                {
                    str.append(str1.charAt(i-1));
                    i--;
                }
            }
        }
        while(i>0)
        {
            str.append(str1.charAt(i-1));
            i--;
        }
        while(j>0)
        {
            str.append(str2.charAt(j-1));
            j--;
        }
        str.reverse();
        return str.toString();
    }

}
