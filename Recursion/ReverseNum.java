package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

// 5 4 3 2 1
public class ReverseNum {
    public static void main(String[] args) {
//        fun(13);
//        funIncrement(5);
//        System.out.println(Arrays.toString(incNum(5,0)));
        oneTwoNAndNToOne(5);
    }
    static void fun(int num)
    {
        if(num==0)
        {
            System.out.print(0);
            return;
        }
       if(num%2==0)
           System.out.println(num);
        fun(num-1);
    }
    static void funIncrement(int num)
    {
        if(num==1)
        {
            System.out.println(1);
            return ;
        }
        funIncrement(num-1);
        System.out.println(num);
    }
    static void oneTwoNAndNToOne(int num)
    {
        if(num==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(num);
        oneTwoNAndNToOne(num-1);
        System.out.println(num);
    }
}
