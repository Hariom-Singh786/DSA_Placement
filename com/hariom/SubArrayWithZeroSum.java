package com.hariom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

//https://www.techiedelight.com/find-sub-array-with-0-sum/
public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[]={ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        findSubArrays(arr);
    }
    static void findSubArrays(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==0)
                {
                    System.out.println("SubArray with Zero Sum ["+arr[i]+"..."+arr[j]+"]");
                }
            }
        }
    }

}
