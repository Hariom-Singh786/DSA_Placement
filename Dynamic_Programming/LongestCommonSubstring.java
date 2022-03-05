package Dynamic_Programming;

/*Longest Common Substring(Dynamic Programming)
Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.
Examples:

Input : X = “GeeksforGeeks”, y = “GeeksQuiz”
Output : 5
The longest common substring is “Geeks” and is of length 5.*/
public class LongestCommonSubstring {
    public static void main(String[] args) {
        String x ="GeeksforGeeks";
        String y = "Geeksor";
        int m = x.length();
        int n = y.length();
        System.out.println(topdown(x,y,m,n));
        System.out.println(recursive(x,y,m,n,0));
    }
    //recursive solution
    static int recursive(String x, String y, int m , int n, int count)
    {
        if(m==0 || n==0)return count;

        if(x.charAt(m-1)==y.charAt(n-1))
        {
            count = recursive(x,y,m-1,n-1,count+1);
        }
        return Math.max(count,Math.max(recursive(x,y,m,n-1,0),recursive(x,y,m-1,n,0)));
    }


    // topdown solution
    static int topdown(String x, String y, int m, int n)
    {
        int [][]dp = new int[m+1][n+1];
       int result =0;
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)dp[i][j]=0;
                else
                {
                    if(x.charAt(i-1)==y.charAt(j-1))
                    {
                        dp[i][j]= 1+dp[i-1][j-1];
                        result = Integer.max(result,dp[i][j]);
                    }
                    else
                    {
                        dp[i][j]=0;
                    }
                }

            }
        }
        return result;
    }
}
