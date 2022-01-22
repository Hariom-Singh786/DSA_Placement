package Recursion;

import java.util.Arrays;

//find maximum value in array in each iteration and fix it in its original position
public class SelectionSortRecursion {
    public static void main(String[] args) {
        int [] arr= {1,4,2,6,7,9,3,5,10,19,12};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int []arr,int r,int c,int maxVIndex)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[maxVIndex])
            {
                selectionSort(arr,r,c+1,c);
            }
            else{
                selectionSort(arr,r,c+1,maxVIndex);
            }
        }
        else{
            int temp=arr[maxVIndex];
            arr[maxVIndex]=arr[r-1];
            arr[r-1]=temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
