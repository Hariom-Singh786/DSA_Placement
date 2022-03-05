package Dynamic_Programming;

import java.util.Arrays;

/*
* Minimum number of deletions and insertions to transform one string into another
Given two strings ‘str1’ and ‘str2’ of size m and n respectively. The task is to remove/delete and insert
* minimum number of characters from/in str1 so as to transform it into str2. It could be possible that the
* same character needs to be removed/deleted from one point of str1 and inserted to some another point.
Example:
Input : str1 = "geeksforgeeks", str2 = "geeks"
Output : Minimum Deletion = 8
         Minimum Insertion = 0 */
public class MinNumInsertionDeletion {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="geeks";
        int m =s1.length();
        int n= s2.length();

        //output  1st way
        System.out.println(Arrays.toString(topdown(s1,s2,m,n)));

        //output  2nd way
        int []ans = topdown(s1,s2,m,n);
        System.out.println("deletion:"+ans[0] +" Insertion :"+ans[1]);
    }
    static int [] topdown(String s1, String s2,int m, int n)
    {
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
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        int LCS = dp[m][n];
        int deletion = m-LCS;
        int insertion = n-LCS;
        return new int[]{deletion,insertion};
    }
}
