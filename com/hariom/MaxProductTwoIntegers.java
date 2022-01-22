package com.hariom;

import java.util.Arrays;

//https://www.techiedelight.com/find-maximum-product-two-integers-array/
public class MaxProductTwoIntegers {
    public static void main(String[] args) {
        int [] arr= {-10,-3,5,6,-2};
        findMaxProduct(arr);
    }

    private static void findMaxProduct(int[] arr) {
        //two pointer method
//        int maxPro1=Integer.MIN_VALUE;
//        int maxPro2=Integer.MIN_VALUE;
//        int s=0;
//        int e=arr.length-1;
//        int pro=1;
//        while(s<e)
//        {
//            pro=arr[s]*arr[e];
//            maxPro1=Math.max(pro,maxPro1);
//            e--;
//        }
//        s=0;e=arr.length-1;pro=1;
//        while(s<e)
//        {
//            pro=arr[s]*arr[e];
//            maxPro2=Math.max(pro,maxPro2);
//            s++;
//        }
//        System.out.println("Maximum sum of 2 Integer of array :"+Math.max(maxPro1,maxPro2));

        //using Array sorting
        //1-> first two element
        //2->last two element
        // multiple can be maximum
        Arrays.sort(arr);
        int s=0;
        int end=arr.length-1;
        if(arr[s]*arr[s+1]<arr[end]+arr[end-1])//means multiple of last two elements is max
        {
            System.out.println("max index of pair : ("+end+" , "+(end-1)+") and product is :"+arr[end]+arr[end-1]);
        }
        else{
            System.out.println("max index of pair : ("+s+" , "+(s+1)+") and product is :"+arr[s]+arr[s+1]);
        }
    }
}
