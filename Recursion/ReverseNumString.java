package Recursion;
//62536->63526
public class ReverseNumString {
    public static void main(String[] args) {
//        System.out.println(rev(878789));
        System.out.println(palindrome(12));
    }
    static int rev(int num)
    {
       int digit= (int)(Math.log10(num))+1;// it is used for finding digit of any number
        return helper(num,digit);
    }
    private static int helper(int num, int digit) {
        if(num%10==num)
        {
            return num;
        }
        return (num%10)*(int)Math.pow(10,digit-1) + helper(num/10,digit-1);
    }
    //find the given number is palindrome or not
    static boolean palindrome(int num)
    {
        return num==rev(num);
    }
}
