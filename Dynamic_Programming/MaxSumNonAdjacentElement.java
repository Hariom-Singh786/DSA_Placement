package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumNonAdjacentElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(11);
        list.add(8);
        System.out.println(maxSumNonAdjacent(list));
    }

    static int maxSumNonAdjacent(ArrayList<Integer>list)
    {
        int prev =list.get(0);
        int prev1=0;
        for(int i=1;i<list.size();i++)
        {
            int pick = list.get(i);
            if(i>1)
            {
                pick+=prev1;
            }
            int nonPick = prev;
            int curr = Math.max(pick,nonPick);
            prev1=prev;
            prev=curr;
        }
        return prev;
    }

//    static int maxSumNonAdjacent(ArrayList<Integer>list)
//    {
//        int n = list.size();
//        int []dp = new int[n+1];
//        Arrays.fill(dp,-1);
//        return maxSum(n-1,list,dp);
//    }
//    static int maxSum(int index, ArrayList<Integer>list,int[]dp)
//    {
//        // dp Approach
////        if(index==0)return list.get(index);
////        if(index<0)return 0;
////        if(dp[index]!=-1)return dp[index];
////        int pick = list.get(index)+ maxSum(index-2,list,dp);
////        int nonPick = 0 + maxSum(index-1,list,dp);
////        return dp[index]=Math.max(pick,nonPick);
//
//        //tabulation
////        dp[0]=0;
////        for(int i=1;i<=index;i++)
////        {
////            int pick = list.get(i);
////            if(i>1)
////            {
////                pick+=dp[i-2];
////            }
////            int notPick = dp[i-1];
////            dp[i]= Math.max(pick,notPick);
////        }
////        return dp[index];
//
//    }
}
