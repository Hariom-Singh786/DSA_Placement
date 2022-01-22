package Recursion;
// 1234 = 10
public class SumOfDigits {
    public static void main(String[] args) {
//        System.out.println(sumOfDig(652227671));
        System.out.println(productDig(1424));
    }
    static long sumOfDig(long num)
    {
        //base condition
        if(num%10==num)
        {
            return num;
        }
        return ((num%10)+sumOfDig(num/10));
    }
    static int productDig(int num)
    {
        if(num%10==num)
        {
            return num;
        }
        return (num%10) * productDig(num/10);
    }
}
