package Dynamic_Programming;

/*Minimum number of insertions to make a string palindrome
Given a string, find the minimum number of characters to be inserted to form Palindrome string out of given string

Examples:
ab: Number of insertions required is 1. bab
aa: Number of insertions required is 0. aa*/
public class MinNumOfInsertionToMakePalindrome {
    public static void main(String[] args) {
        String str = "aebcbda";
        System.out.println("Min Number of Insertion to Make string a palindrome is : "+topdown(str));
    }
    static int topdown(String a)
    {
        int m = a.length();
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        int [][]dp = new int[m+1][m+1];

        // code of getting LPS
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else
                {
                    if(a.charAt(i-1)==b.charAt(j-1))
                    {
                        dp[i][j]= 1 + dp[i-1][j-1];
                    }else
                    {
                        dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return m - dp[m][m];
    }
}
