package TwoPointers;

import java.util.Arrays;

public class KsubArraySum {
    public static void main(String[] args) {
        int []A={3, 5, 6, 2, 4, 7, 8};
        int k=5;
        System.out.println(Arrays.toString(subarray(A,k)));
    }
    static int[] subarray(int[]A, int k)
    {
        int []arr= new int[A.length-k+1];
        int i;
        int id=0;
        for(i=0;i<A.length && k<=A.length;i++)
        {
            int j=i;
            int sum=0;
            while(j<k)
            {
                sum+=A[j++];
            }
            arr[id++]=sum;
            k++;
        }
        return arr;
    }
}
