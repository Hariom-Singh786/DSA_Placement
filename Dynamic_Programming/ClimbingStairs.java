package Dynamic_Programming;

public class ClimbingStairs {
    public static void main(String[] args) {

        // this is tabulation way with space optimization
        int index =3;
        //base case when we reach at index 0 or index 1 there is only one way so returning 1
       int prevStep=1;
       int nextPrevStep=1;
        for(int i=2;i<=index;i++)
        {
           int output = prevStep+nextPrevStep;
           nextPrevStep=prevStep;
           prevStep=output;

        }
        System.out.println(prevStep);
    }
}


    // 2. this is tabulation way
//    int index =3;
//    int [] dp = new int [index+1];
////base case when we reach at index 0 or index 1 there is only one way so returning 1
//        dp[0]=1;
//                dp[1]=1;
//                for(int i=2;i<=index;i++)
//                {
//                dp[i]=dp[i-1]+dp[i-2];
//                }
//                System.out.println(dp[index]);



// 1. memoization technique
//    public static void main(String[] args) {
//        int index =4;
//        System.out.println(climb(index));
//    }
//    static int climb(int index)
//    {
//        if(index==1 || index==0)
//        {
//            return 1;
//        }
//        return climb(index-1)+climb(index-2);
//    }
