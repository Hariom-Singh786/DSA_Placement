package workATtech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArithmaticSequence {
    public static void main(String[] args) {
//        Array: [9, 13, 5, 15, 7, 11]
//        Answer: true
//        Explanation:
//        This can be reordered to [5, 7, 9, 11, 13, 15] or
//                [15, 13, 11, 9, 7, 5] both of which are arithmetic sequences.
        int [] arr= {6, 9, 13, 5, 15, 7, 11};
        System.out.println(arithmatic(arr));
    }
    static boolean arithmatic(int [] arr)
    {
        Arrays.sort(arr);
        int diff= arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff)
                return false;
        }
        return true;
    }
}
