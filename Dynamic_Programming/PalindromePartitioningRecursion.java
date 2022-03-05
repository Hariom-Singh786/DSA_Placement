package Dynamic_Programming;

/*Palindrome Partitioning using Recursion
Given a string, a partitioning of the string is a palindrome partitioning if every substring of the partition is a
palindrome.
Example:
  “aba|b|bbabb|a|b|aba” is a palindrome partitioning of “ababbbabbababa”.
*/

import java.util.Arrays;

public class PalindromePartitioningRecursion {
    public static void main(String[] args) {
        String s= "abcde";  // ->   a | b | c | d | e
        System.out.println(memoization(s));
    }
    static boolean isPalindrome(String s,int i, int j)
    {
        if(i>=j)return true;
        if(s.charAt(i)==s.charAt(j))
        {
            return isPalindrome(s,i+1,j-1);
        }
        return false;
    }
    static int memoization(String s)
    {
        int n = s.length();
        int [][]dp = new int[n+1][n+1];
        for(int []row : dp)
        {
            Arrays.fill(row,-1);
        }
        return minNumOfPartition(s,0,n-1,dp);
    }
    static int minNumOfPartition(String s, int i, int j, int [][]dp)
    {
        if(i>=j) return 0;
        if(isPalindrome(s, i, j))return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int mn =Integer.MAX_VALUE;
        for(int k =i;k<=j-1;k++)
        {
            int temp = minNumOfPartition(s,i,k,dp)+minNumOfPartition(s,k+1,j,dp)+1;
            if(temp<mn)
                mn =temp;
        }
        return dp[i][j]=mn;
    }
}
