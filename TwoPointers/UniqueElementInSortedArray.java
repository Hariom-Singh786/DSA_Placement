package TwoPointers;

public class UniqueElementInSortedArray {
    public static void main(String[] args) {
        int []arr= {1,1,1,1,1};//1,2,3,4,5,6=>6
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int []A)
    {
        int count=0;
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i]!=A[i+1])
            {
                count++;
            }
            else{
                continue;
            }
        }
        return count+1;
    }
}
