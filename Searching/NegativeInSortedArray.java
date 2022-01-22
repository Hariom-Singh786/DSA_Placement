package Searching;

public class NegativeInSortedArray {
    public static void main(String[] args) {
        int [] arr= {0, 1, 2, 3, 4, 6, 7, 8};
        findNegatives(arr, arr.length);
    }
    static void findNegatives(int []arr, int n)
    {
        int count=0;
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            if(arr[i]<0 )
            {
                count++;
            }
            else if(arr[j]<0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
