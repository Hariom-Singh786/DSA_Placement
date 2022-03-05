package Dynamic_Programming;

/*Minimum number of deletions to make a string palindrome
Given a string of size ‘n’. The task is to remove or delete minimum number of characters from the string so
that the resultant string is palindrome.
Examples :

Input : aebcbda
Output : 2
Remove characters 'e' and 'd'
Resultant string will be 'abcba'
which is a palindromic string*/

public class MinNumOfDelToMakePalindrome {
    public static void main(String[] args) {
        String str = "aebcbda";
        int m = str.length();
        System.out.println("Min number of Deletion : "+topdown(str,m));
    }
    static int topdown(String str1,int m )
    {
        StringBuilder str2 = new StringBuilder(str1);
        str2=str2.reverse();
        int [][]dp = new int [m+1][m+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else
                {
                    if(str1.charAt(i-1)==str2.charAt(j-1))
                        dp[i][j]=1+dp[i-1][j-1];
                    else
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

                }
            }
        }
        int LCS = dp[m][m];
        return m-LCS;
    }
}
