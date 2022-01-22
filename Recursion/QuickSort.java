package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr= {3,5,7,9,2,4,6,10,8,1,19};
        System.out.println(Arrays.toString(arr));
        sorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int []arr, int lo, int hi)
    {
        if(lo>=hi)
        {
            return;
        }
        int s=lo;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sorting(arr,lo,e);
        sorting(arr,s,hi);
    }
}
