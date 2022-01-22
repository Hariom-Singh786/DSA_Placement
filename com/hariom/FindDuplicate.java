package com.hariom;

import java.util.Arrays;

//https://www.techiedelight.com/find-duplicate-element-limited-range-array/
public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,2};
        System.out.println("duplicate value is :"+findDuplicates(arr));
    }
//    static void findDuplicates(int [] arr)
//    {
//        boolean flag= false;
//        int length= arr.length;
//        Arrays.sort(arr);
//        for(int i=0;i<length-1;i++)
//        {
//            if(arr[i]==arr[i+1])
//            {
//                flag=true;
//                System.out.println("duplicate in Array :"+arr[i]);
//            }
//        }
//        if(flag==false)
//        {
//            System.out.println("duplicates not found");
//        }
//    }
    static int findDuplicates(int [] arr)
    {
        boolean visited[]=new boolean[arr.length+1];
        for(int val:arr)
        {
            if(visited[val])
            {
                return val;
            }
            visited[val]=true;
        }
        return -1;
    }
}
