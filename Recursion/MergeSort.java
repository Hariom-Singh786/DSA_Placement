package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={8,10,2,9,5,19,17,4,3,80,1,16};
        System.out.println(Arrays.toString(dividing(arr)));
    }
    static int[] dividing(int []arr){
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int[] left= dividing(Arrays.copyOfRange(arr,0,mid));
        int[] right=dividing(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left, int [] right)
    {
        int []mix= new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[k]=left[i++];
            }
            else
            {
                mix[k]=right[j++];
            }
            k++;
        }
        while(i<left.length)
        {
            mix[k++]=left[i++];
        }
        while(j<right.length)
        {
            mix[k++]=right[j++];
        }
        return mix;
    }
}
