package workATtech;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//https://workat.tech/problem-solving/practice/implement-insertion-sort
public class ImplementInsertionSort {
    public static void main(String[] args) {
        int [] arr={4,3,2,10,12,1,5,6};
        insertionSort(arr);
    }
    static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
