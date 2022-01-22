package Recursion;

import java.util.*;

public class FindingAllIndexes {
    public static void main(String[] args) {
       int []arr= {1,2,3,2,4,6,2};
        System.out.println(allIndexes(arr,0,5));
    }
//    static ArrayList<Integer> list= new ArrayList<>();
    static ArrayList<Integer> allIndexes(int [] arr, int index,int target)
    {
        ArrayList<Integer>list= new ArrayList<>();
        if(index==arr.length) // means we are outside the array
        {
            return new ArrayList<>();
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        allIndexes(arr,index+1,target);
        return list;
    }
}
