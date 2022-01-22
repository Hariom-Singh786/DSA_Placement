package com.hariom;

import java.util.Arrays;

//https://www.techiedelight.com/inplace-merge-two-sorted-arrays/
public class InplaceMergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] x = {1, 4, 7, 8, 10};
        int[] y = {2, 3, 9};
        int lx=x.length;
        int ly=y.length;
        merge(x, y,lx,ly);
//        int[] arr = new int[x.length + y.length];
//        int i = 0;
//        int j = 0;
//        int idx = 0;
//        while (i < x.length && j < y.length) {
//            if (x[i] < y[j]) {
//                arr[idx++] = x[i];
//                i++;
//            } else if (x[i] > y[j]) {
//                arr[idx++] = y[j];
//                j++;
//            } else {
//                i++;
//                j++;
//            }
//        }
//        while (i < x.length) {
//            arr[idx++] = x[i++];
//        }
//        while (j < y.length) {
//            arr[idx++] = y[j++];
//        }
//        //displaying
//        int id=0;
//        for(int a=0;a<x.length;a++)
//        {
//            x[a]=arr[id++];
//        }
//        for(int a=0;a<y.length;a++)
//        {
//            y[a]=arr[id++];
//        }
//        System.out.println("x[] :"+Arrays.toString(x));
//        System.out.println("y[] :"+Arrays.toString(y));
    }
    static void merge(int [] x,int [] y,int lx,int ly)
    {
        int i=0;
        int j=0;
        while(i<lx && j<ly)
        {
            if(x[i]<=y[j])
            {
                i++;
            }
            else if(x[i]>y[j])
            {
                int temp=x[i];
                x[i]=y[j];
                y[j]=temp;
                i++;
            }
            if(j<ly-1 && y[j+1]<y[j])
            {
                int temp=y[j];
                int tempj=j+1;
                while(tempj<ly && y[tempj]<temp && tempj<ly)
                {
                    y[tempj-1]=y[tempj];
                    tempj++;
                }
                y[tempj-1]=temp;
            }
        }
        System.out.println("x[] :"+Arrays.toString(x));
        System.out.println("y[] :"+Arrays.toString(y));
    }
}
