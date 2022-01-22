package TwoPointers;


public class TwoSumSorted {
    public static void main(String[] args) {
        int [] arr= {};
        System.out.println(foundSum(arr));
    }
    static boolean foundSum(int [] A)
    {
        int i=0;
        int j=A.length-1;
        if(A.length<=1)
        {
            return false;
        }
        while(i<j)
        {
            if(A[i]== -A[j])
            {
                return true;
            }
            if(A[j]>Math.abs(A[i]))
            {
                j--;
            }
            if(Math.abs(A[i])>A[j])
            {
                i++;
            }
        }
        return false;
    }
}
