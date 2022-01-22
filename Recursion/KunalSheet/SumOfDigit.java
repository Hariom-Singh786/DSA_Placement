package Recursion.KunalSheet;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    static int sum(int num)
    {
        if(num%10==num)//it means that there is only one digit remained in the given number
        {
            return num;
        }
        return (num%10) + sum(num/10);
    }
}
