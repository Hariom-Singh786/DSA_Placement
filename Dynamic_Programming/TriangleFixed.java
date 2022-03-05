package Dynamic_Programming;

import java.util.Arrays;

public class TriangleFixed {
    public static void main(String[] args) {
        int [][]maze = {{1},{1,3},{5,1,4},{3,2,3,6}};
//        System.out.println(minSumPath(maze));
        System.out.println(tabulation(maze, maze.length));
    }
    static int minSumPath(int[][]maze)
    {
        int[][]dp = new int[maze.length][maze.length];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return fun(0,0,maze,dp);
    }
    static int fun(int i, int j, int [][]maze, int [][]dp)
    {
        if(i==maze.length-1) return maze[i][j];
        if(dp[i][j]!=-1)
            return dp[i][j];
//        int down=0,diag=0;
            int down = maze[i][j]+fun(i+1,j,maze,dp);

           int diag =maze[i][j]+fun(i+1,j+1,maze,dp);
            return dp[i][j]=Math.min(down,diag);
    }
    //tabulation form
    static int tabulation(int [][]maze,int n)
    {
        int [][]dp = new int[n][n];
        for(int i=0;i<n;i++)
        {
            dp[n-1][i]=maze[n-1][i];
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int down = maze[i][j]+dp[i+1][j];
                int diag=maze[i][j]+dp[i+1][j+1];
                dp[i][j]=Math.min(down,diag);
            }
        }
        return dp[0][0];
    }
}
