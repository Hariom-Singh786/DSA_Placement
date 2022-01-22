package Recursion.KunalSheet;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6};
        sumTriangle(arr);
    }
    static void sumTriangle(int []A)
    {
        if(A.length==0)
        {
            return;
        }
        int []temp= new int[A.length-1];
        for(int i=0;i<A.length-1;i++)
        {
            int val=A[i]+A[i+1];
            temp[i]=val;
        }
        //recursive call
//        System.out.println(Arrays.toString(A));
        sumTriangle(temp);
        //prints Arrays
        System.out.println(Arrays.toString(A));

    }
}
