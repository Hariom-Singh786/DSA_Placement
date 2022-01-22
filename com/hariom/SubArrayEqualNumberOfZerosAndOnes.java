package com.hariom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.techiedelight.com/find-maximum-length-sub-array-equal-number-0s-1s/
public class SubArrayEqualNumberOfZerosAndOnes {
    public static void main(String[] args) {
        int [] nums= {0,0,1,0,1,0,0};
        findSubArray(nums);
    }
    static void findSubArray(int [] nums)
    {
        Map<Integer, Integer> map= new HashMap<>();
        int len=0;
        int end=-1;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum += (nums[i]==0)?-1:1;
            if(map.containsKey(sum))
            {
                if(len<i-map.get(sum))
                {
                    len=i-map.get(sum);
                    end=i;
                }
            }
            else{
                map.put(sum,i);
            }
        }
        if(end!=-1)
        {
            System.out.println("max length subArray with equal number of Ones and Zeros :["+(end-len+1)+","+end+"]");
        }
    }
}

