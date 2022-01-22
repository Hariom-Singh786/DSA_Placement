package workATtech;

import java.util.Arrays;

//https://workat.tech/problem-solving/practice/merge-two-sorted-arrays
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] x= {1,2,3,4,4};
        int [] y= {2,4,5,5};
        System.out.println(Arrays.toString(merge(x,y)));
    }
    static int[] merge(int[]x ,int []y)
    {
        int []arr= new int[x.length+y.length];
        int i=0, j=0;
        int id=0;
        while(i<x.length && j<y.length)
        {
            if(x[i]<=y[j])
            {
                arr[id++]=x[i++];
            }else{
                arr[id++]=y[j++];
            }
        }
        while(i<x.length)
        {
            arr[id++]=x[i++];
        }
        while(j<y.length)
        {
            arr[id++]=y[j++];
        }
        return arr;
    }
}
