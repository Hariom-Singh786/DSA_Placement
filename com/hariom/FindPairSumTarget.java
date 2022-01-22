package com.hariom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://www.techiedelight.com/find-pair-with-given-sum-array/
public class FindPairSumTarget {
    public static void main(String[] args) {
        int [] arr= {8, 7, 2, 5, 3, 1};
        int target= 10;
        findPair(arr,target);

    }
//    private static void findPair(int[] arr, int target) {
//        //bruteforce approach
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]+arr[j]==target)
//                {
//                    System.out.println("pair : "+ "("+arr[i] +","+arr[j]+")");
//                    return;
//                }
//            }
//        }
//        System.out.println("Pair not Found!");
//    }

    //using sorting approach
//    static void findPair(int [] arr, int target)
//    {
//        Arrays.sort(arr);
//        int low= 0;
//        int high=arr.length-1;
//        while(low<high)
//        {
//            if(arr[low]+arr[high]==target)
//            {
//                System.out.println("Pair : (" +arr[low]+","+arr[high]+")");
//                return;
//            }
//            if(arr[low]+arr[high]<target)
//            {
//                low++;
//            }
//            else{
//                high--;
//            }
//        }
//        System.out.println("Pair not found !");
//    }


    //using HashMap method
    static void findPair(int []arr, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(target-arr[i]))
            {

                System.out.printf("Pair found (%d, %d)",arr[map.get(target - arr[i])], arr[i]);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("Pair not found!");
    }

}
