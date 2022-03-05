package Dynamic_Programming;


import java.util.Arrays;

public class MaximumFallingPathSum {
    public static void main(String[] args) {
        int [][]maze ={{12,20,34,80},{10,30,7,34,},{6,90,100,30},{10,30,50,14}};
        int n = maze.length;
        int m =maze[0].length;
        //tabulation call
        System.out.println(tabulation(maze,n,m));

        //memoization call
//        System.out.println(MaxPathSum(maze));
    }
    static int MaxPathSum(int [][]matrix)
    {
        int n = matrix.length;
        int m =matrix[0].length;
        int [][]dp = new int[n][m];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        int maxi =Integer.MIN_VALUE;
        for(int j=0;j<m;j++)
        {
            int ans= fun(0,j,matrix,dp,n,m);
            maxi = Math.max(maxi,ans);
        }
        return maxi;
    }
    static int fun(int i, int j, int[][]matrix, int [][]dp, int n, int m)
    {
        if(j<0 || j>=m)
            return (int)Math.pow(-10,9);
        if(i<0 || i>=n)
        {
            return (int)Math.pow(-10,9);
        }
        if(i==n-1) return matrix[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int down= matrix[i][j]+fun(i+1,j,matrix,dp,n,m);
        int ldiag=matrix[i][j]+fun(i+1,j-1,matrix,dp,n,m);
        int rdiag = matrix[i][j]+fun(i+1,j+1,matrix,dp,n,m);
        return dp[i][j]=Math.max(down,Math.max(ldiag,rdiag));
    }
    static int tabulation(int [][]matrix,int n, int m)
    {
        int [][]dp = new int[n][m];
        for(int i=0;i<m;i++)
        {
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int up = matrix[i][j] + dp[i-1][j];

                int leftDiagonal= matrix[i][j];
                if(j-1>=0) leftDiagonal += dp[i-1][j-1];
                else leftDiagonal += (int)Math.pow(-10,9);

                int rightDiagonal = matrix[i][j];
                if(j+1<m) rightDiagonal += dp[i-1][j+1];
                else rightDiagonal += (int)Math.pow(-10,9);

                dp[i][j] = Math.max(up, Math.max(leftDiagonal,rightDiagonal));

            }
        }
        int maxi = Integer.MIN_VALUE;

        for(int j=0; j<m;j++){
            maxi = Math.max(maxi,dp[n-1][j]);
        }

        return maxi;
    }
}
