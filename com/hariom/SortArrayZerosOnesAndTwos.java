package com.hariom;

import java.util.Arrays;

//https://www.techiedelight.com/sort-array-containing-0s-1s-2s-dutch-national-flag-problem/
public class SortArrayZerosOnesAndTwos {
    //1 naive approach
    public static void main(String[] args) {
        int [] arr= {0,1,1,2,0,2,1,2,1,1,1,0,0};
        dutchNationalFlag(arr);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        //2 count zeros , ones and twos approach
//        countApproach(arr);
    }
//    static void countApproach(int[] arr)
//    {
//        int zeros=0;
//        int ones=0;
//        int twos=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==0)
//            {
//                zeros++;
//            }
//            if(arr[i]==1)
//            {
//                ones++;
//            }
//            if(arr[i]==2)
//            {
//                twos++;
//            }
//        }
//
//        int index=0;
//        for(int j=0;j<zeros;j++)
//        {
//            arr[index++]=0;
//        }
//        for(int j=0;j<ones;j++)
//        {
//            arr[index++]=1;
//        }
//        for(int j=0;j<twos;j++)
//        {
//            arr[index++]=2;
//        }
//       //displaying arrays
//        System.out.println(Arrays.toString(arr));
//    }

    //(Dutch National Flag Problem) approach
    static void dutchNationalFlag(int []arr)
    {
      int lo=0;
      int mid=0;
      int hi=arr.length-1;
      int pivot=1;
      while(mid<=hi)
      {
       if(arr[mid]<pivot)
           {
               swap(arr,lo,mid);
               ++lo;
               ++mid;
           }
       else if(arr[mid]>pivot)
           {
               swap(arr,mid,hi);
               --hi;
           }
           else{
               ++mid;
           }
      }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr, int lo, int hi)
    {
        int temp=arr[lo];
        arr[lo]=arr[hi];
        arr[hi]=temp;
    }
}
