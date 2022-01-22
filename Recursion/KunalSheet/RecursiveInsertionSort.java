package Recursion.KunalSheet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int []arr= {2,9,1,5,6};
        sort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr, int r)
    {
        if(r==arr.length)
        {
            return;
        }
        for(int i=r;i>=0;i--)
        {
            if(i>0 && arr[i]<arr[i-1])
            {
                //swapping
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        sort(arr,r+1);
    }
}
