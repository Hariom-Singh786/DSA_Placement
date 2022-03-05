package Dynamic_Programming;

import java.util.Arrays;
 // find unique paths in 2d Matrix with obstacles
public class Unique_path2D {
    public static void main(String[] args) {
        int [][]maze ={{0,0,0},{0,-1,0},{0,0,0}};
        int n = maze.length;
        int m =n;
        System.out.println(mazePath(maze,n,m));
    }
    static int mazePath(int [][]maze, int n, int m)
    {
        int [][]dp = new int[n][m];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return fun(n-1,m-1,maze,dp);
    }
    static int fun(int i, int j, int[][]maze, int [][]dp)
    {
        if(dp[i][j]!=-1)
        {
           return dp[i][j];
        }
        if(i>0 && j>0 && maze[i][j]==-1)return 0;
        if(i==0 && j==0)return 1;
        if(i<0 || j<0)return 0;
        int lf=0,up=0;
        if(i>0)
        {
            up = fun(i-1,j,maze,dp);
        }
        if(j>0)
        {
            lf=fun(i,j-1,maze,dp);
        }
        return dp[i][j]=up+lf;
    }
}