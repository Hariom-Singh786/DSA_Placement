package TwoPointers;

public class KDifferentPairs {
    public static void main(String[] args) {
        int [] arr= {1,3,5,7,10};
        int k=1;
        System.out.println(kDiffPairs(arr,k));
    }
    static int kDiffPairs (int[] A, int k) {
        if(A.length<=1)
        {
            return 0;
        }
        int i=0;
        int j=i+1;
        int count=0;
        while(i<A.length-1 && j<A.length)
        {
            if((A[j]-A[i]) == k && j!=A.length-1)
            {
                count++;
                i++;
                j++;
            }
            // else if(((A[j]-A[i]) == k) && j == (A.length))
            // {
            // 	count++;
            // 	i++;
            // }

            else if((A[j]-A[i]) < k )
            {
                j++;
            }
            else if((A[j]-A[i]) > k)
            {
                i++;
            }
            else{
                count++;
                i++;
            }
        }
        return count;
    }
}
