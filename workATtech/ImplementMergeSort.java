package workATtech;

import java.util.Arrays;

public class ImplementMergeSort {
    public static void main(String[] args) {
        int [] arr={5 ,4, 2, 5, 3, 1};
        int left=0;
        int right=arr.length-1;
        merge(arr,left,right);
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int [] arr, int left,int right)
    {
        if(left<right)
       {
           int mid=left+(right-left)/2;
           merge(arr,left,mid);
           merge(arr,mid+1,right);
           mergeArray(arr,left,mid,right);
       }
    }
    static void mergeArray(int[] arr,int left,int mid, int right)
    {
        int n1= mid-left+1;
        int n2= right-mid;
        int []a= new int[n1];
        int []b= new int[n2];

        for(int i=0;i<n1;i++)
        {
            a[i]=arr[left+i];
        }

        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                arr[k]=a[i++];
            }
            else{
                arr[k]=b[j++];
            }
            k++;
        }
        while(i<n1)
        {
            arr[k++]=a[i++];
        }
        while(j<n2)
        {
            arr[k++]=a[j++];
        }
    }
}
