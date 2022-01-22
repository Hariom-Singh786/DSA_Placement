package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int [] arr= {5,6,0,1,9,10,4,3,19,11,24,5};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr, int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[c+1])
            {
                //swap both the elements
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            sort(arr,r,c+1);
        }
        else{
            sort(arr,r-1,0);
        }

    }
}
