package Dynamic_Programming;

import java.util.Arrays;

public class NinjaAndBob3D {
    public static void main(String[] args) {
        int [][]matrix= {{2,3,1,2},
                        {3,4,2,2},
                        {5,6,3,5}};
        int row= matrix.length;
        int col= matrix[0].length;
//        System.out.println(maxPathSum(matrix,row,col));
        System.out.println(tabulation(matrix,row,col));
    }

    static int tabulation(int [][]grid, int r, int c)
    {
        int [][][]dp = new int[r][c][c];
        //base cases when both are at the last row
        for(int j1 =0;j1<c;j1++)
        {
            for(int j2=0;j2<c;j2++)
            {
                if(j1==j2) dp[r-1][j1][j2]=grid[r-1][j1];
                else dp[r-1][j1][j2]=grid[r-1][j1]+grid[r-1][j2];
            }
        }
        for(int i=r-2;i>=0;i--)
        {
            for(int j1=0;j1<c;j1++)
            {
                for(int j2=0;j2<c;j2++)
                {
                    int maxi= (int)Math.pow(-10,9);
                    for(int dj1=-1;dj1<=1;dj1++)
                    {
                        for(int dj2=-1;dj2<=1;dj2++)
                        {
                            int value=0;
                            if(j1==j2) value = grid[i][j1];
                            else value= grid[i][j1]+grid[i][j2];
                            if(j1+dj1>=0 && j1+dj1<c && j2+dj2>=0 && j2+dj2<c)
                            {
                                value+=dp[i+1][j1+dj1][j2+dj2];
                            }

                            else value+= (int)Math.pow(-10,9);
                            maxi = Math.max(maxi,value);
                        }
                    }
                    dp[i][j1][j2]=maxi;
                }
            }
        }
        return dp[0][0][c-1];
    }


    static int maxPathSum(int [][]matrix, int r, int c)
    {
        int [][][]dp = new int[r][c][c];
        for(int [][]row:dp)
        {
            for(int []col:row)
            {
                Arrays.fill(col,-1);
            }
        }
        return fun(0,0,c-1,r,c,matrix,dp);
    }
    static int fun(int i, int j1, int j2, int r, int c, int [][]grid, int [][][]dp)
    {
        //base case
        if(j1<0 || j1>=c || j2<0 || j2>=c)
        {
            return (int)Math.pow(-10,9);
        }
        if(i==r-1)
        {
            if(j1==j2) return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1)return dp[i][j1][j2];
        //explore all the rows and columns
        int maxi= Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
                int value=0;
                if(j1==j2) value = grid[i][j1];
                else value= grid[i][j1]+grid[i][j2];
                value+=fun(i+1,j1+dj1,j2+dj2,r,c,grid,dp);
                maxi = Math.max(maxi,value);
            }
        }
        return dp[i][j1][j2]=maxi;
    }
}
