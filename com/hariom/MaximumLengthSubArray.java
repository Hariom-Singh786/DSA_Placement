package com.hariom;

import java.util.HashMap;
import java.util.Map;

//https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/
public class MaximumLengthSubArray {
    public static void main(String[] args) {
       int  nums[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int target = 8;
//        int[] arr = {1, 2, 3, 4, 5, 6, 8};
//        int target = 9;
        findSubArray(nums, target);
    }

    static void findSubArray(int[] arr, int S) {
//        int len=0;
//        int endpoint=-1;
//        for(int i=0;i<arr.length;i++)
//        {
//            int sum=0;
//            for(int j=i;j<arr.length;j++)
//            {
//                sum+=arr[j];
//                if(sum==k)
//                {
//                   if(len<j-i+1)
//                   {
//                       len=j-i+1;
//                       endpoint=j;
//                   }
//                }
//            }
//        }
//        System.out.println("[" + (endpoint - len + 1)
//                + ", " + endpoint + "]");
        // create an empty HashMap to store the ending index of the first
        // subarray having some sum
        Map<Integer, Integer> map = new HashMap<>();

        // insert (0, -1) pair into the set to handle the case when a
        // subarray with sum `S` starts from index 0
        map.put(0, -1);

        int target = 0;

        // `len` stores the maximum length of subarray with sum `S`
        int len = 0;

        // stores ending index of the maximum length subarray having sum `S`
        int ending_index = -1;

        // traverse the given array
        for (int i = 0; i < arr.length; i++) {
            // sum of elements so far
            target += arr[i];

            // if the sum is seen for the first time, insert the sum with its
            // into the map
            map.putIfAbsent(target, i);

            // update length and ending index of the maximum length subarray
            // having sum `S`
            if (map.containsKey(target - S) && len < i - map.get(target - S)) {
                len = i - map.get(target - S);
                ending_index = i;
            }
        }

        // print the subarray
        System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");

    }
}