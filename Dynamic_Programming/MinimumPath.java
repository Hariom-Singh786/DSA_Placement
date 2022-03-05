package Dynamic_Programming;

import java.util.Arrays;

// DP with memoization
public class MinimumPath {
    public static void main(String[] args) {
        int[][]maze = {{5,9,6},{11,5,2}};
        int n = maze.length;
        int m = maze[0].length;
//        System.out.println(minPathMaze(maze,n,m));
        //tabulation function call
        System.out.println(tabulation(n,m,maze));
    }
    static int minPathMaze(int [][]maze,int row, int col)
    {
        int [][]dp= new int[row][col];
        for(int []val:dp)
        {
            Arrays.fill(val,-1);
        }
        return fun(row-1,col-1,maze,dp);
    }
    static int fun(int i, int j, int[][]maze, int [][]dp)
    {
        if(i==0 && j==0)return maze[0][0];
        if(i<0 || j<0) return (int)Math.pow(10,9);
        if(dp[i][j]!=-1) return dp[i][j];
        int left =maze[i][j]+fun(i,j-1,maze,dp);
        int up = maze[i][j]+fun(i-1,j,maze,dp);
        return Math.min(left,up);
    }

    // DP using tabulation (it is the bottom up approach)
    static int tabulation(int row, int col, int[][]maze)
    {
        int [][]dp= new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 && j==0) dp[i][j]=maze[i][j];
                else
                {
                    int up = maze[i][j];
                    if(i>0)
                    {
                        up+=dp[i-1][j];
                    }else
                    {
                        up+=(int)Math.pow(10,9);
                    }
                    int lf = maze[i][j];
                    if(j>0)
                    {
                        lf+=dp[i][j-1];
                    }
                    else
                    {
                        lf+=(int)Math.pow(10,9);
                    }
                    dp[i][j]=Math.min(up,lf);
                }
            }
        }
        return dp[row-1][col-1];
    }
}
