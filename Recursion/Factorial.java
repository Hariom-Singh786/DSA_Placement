package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    static int fact(int num)
    {
        if(num==1)
        {
            return 1;
        }

        return num*fact(num-1);
    }
}
