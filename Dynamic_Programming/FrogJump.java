package Dynamic_Programming;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[]height = {30,10,60 , 10 , 60 , 50};
        int n = height.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);
        System.out.println(frog_jumpKth(n-1,height,dp,n-1));
//        System.out.println(frog_jump(n-1,height,dp));
    }
//    static int frog_jump(int index, int [] height,int []dp)
//    {
//       if(index==0)return 0;
//       if(dp[index]!=-1)
//       {
//           return dp[index];
//       }
//       int left = frog_jump(index-1,height,dp)+Math.abs(height[index]-height[index-1]);
//       int right=Integer.MAX_VALUE;
//       if(index>1)
//       {
//           right = frog_jump(index-2,height,dp)+Math.abs(height[index]-height[index-2]);
//       }
//       return dp[index]=Math.min(left,right);
//    }


    // frog jump with kth steps

    static  int frog_jumpKth(int index, int []height,int []dp,int k)
    {
        if(index==0)return 0;
        if(dp[index]!=-1)
        {
            return dp[index];
        }
        int minSteps=Integer.MAX_VALUE;
        for(int i =1;i<=k;i++)
        {
            if(index-i>=0)
            {
                int jump=frog_jumpKth(index-i,height,dp,k)+Math.abs(height[index]-height[index-i]);
                minSteps=Math.min(minSteps,jump);
            }
        }
        return dp[index]=minSteps;
    }

}
