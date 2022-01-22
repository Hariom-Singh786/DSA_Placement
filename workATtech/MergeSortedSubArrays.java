package workATtech;

import java.util.Arrays;

public class MergeSortedSubArrays {
    public static void main(String[] args) {
        int [] arr= {10};
        int endidx=0;
        System.out.println("preArray:"+Arrays.toString(arr));
        merge(arr,endidx);
    }
    static void merge(int [] arr, int endIndex)
    {		int i=0,id=0;
        int j=endIndex;
        int []x=new int[arr.length];
        while(i<endIndex && j<arr.length)
        {
            if(arr[i]<arr[j])
            {
                x[id++]=arr[i++];
            }
            else{
                x[id++]=arr[j++];
            }
        }
        while(i<endIndex)
        {
            x[id++]=arr[i++];
        }
        while(j<arr.length)
        {
            x[id++]=arr[j++];
        }
        System.out.println(Arrays.toString(x));

    }

}
