package com.hariom;

import java.util.HashSet;
import java.util.Set;

//https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] nums = { 4, -6, 3, -1, 4, 2, 7};

        if(hasZeroSumSubarray(nums))
        {
            System.out.println("found");
        }
        else{
            System.out.println("Not Found");
        }
    }
    static Boolean hasZeroSumSubarray(int []arr)
    {
        Set<Integer>set= new HashSet<>();
        set.add(0);

        int sum=0;
        for(int value:arr)
        {
            sum+=value;
            if(set.contains(sum))
            {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
