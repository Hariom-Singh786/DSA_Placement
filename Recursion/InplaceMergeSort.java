package Recursion;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 9, 18, 4, 13, 10, 5};
        inplaceMerge(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void inplaceMerge(int[] arr, int s, int e)
    {
        if(e-s==1)
        {
            return;
        }
        int mid=(s+e)/2;
        inplaceMerge(arr,s,mid);
        inplaceMerge(arr,mid,e);
        merge(arr,s,mid,e);
    }
    static void merge(int []arr, int s, int m, int e)
    {
        int []mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i++];
            }
            else{
                mix[k]=arr[j++];
            }
            k++;
        }
        while(i<m)
        {
            mix[k++]=arr[i++];
        }
        while(j<e)
        {
            mix[k++]=arr[j++];
        }
        for(int l=0;l< mix.length;l++)
        {
            arr[s+l]=mix[l];
        }
    }
}
