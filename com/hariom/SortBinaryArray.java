package com.hariom;

import java.util.Arrays;

//https://www.techiedelight.com/sort-binary-array-linear-time/
public class SortBinaryArray {
    public static void main(String[] args) {
        int [] arr= {1,0,0,1,0,1,1,0,1,0,0,1};
        sortBinary(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortBinary(int [] arr)
    {
        int zeros=0;
        for(int val:arr)
        {
            if(val==0)
            {
                zeros++;
            }
        }
        int k=0;
        while(zeros!=0)
        {

            arr[k++]=0;
            zeros--;
        }
        while(k<arr.length)
        {
            arr[k++]=1;
        }
    }
}
