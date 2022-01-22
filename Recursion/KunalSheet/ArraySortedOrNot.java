package Recursion.KunalSheet;

import java.util.Stack;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr= {1,2,5,4,5};
        int n= arr.length;
        System.out.println(check(arr,n));
    }
    static boolean check(int [] arr, int n)
    {
        if(n==1 || n==0) return true;
        if(arr[n-1]<arr[n-2]) return false;
        return check(arr,n-1);
    }
}
