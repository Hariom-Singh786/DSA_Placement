package Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
//        System.out.println(sum(5));// 5+4+3+2+1=15
        System.out.println(product(6));//5*4*3*2*1= 120
    }
    static int sum(int num)
    {
        if(num==0)
        {
            return 0;
        }
        return num+sum(num-1);
    }
    static int product(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*product(num-1);
    }
}
