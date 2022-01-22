package Recursion.KunalSheet;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int []arr={2,9,1,8,0,5,7,4,3};
        sort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr, int i)
    {
        if(i==arr.length-1)
        {
            return;
        }
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            sort(arr,i+1);
        }
    }
}
