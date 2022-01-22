package Recursion.KunalSheet;

public class PrimeOrNot {
    public static void main(String[] args) {
//        System.out.println(check(10,2));
        System.out.println(checkPrime(58,2));
    }

    // first way of solving
    static boolean check(int num,int i)
    {
        if(num<i)
        {
           return false;
        }
        if(num==i)//num==2 , 2 is the first ,smallest , even prime number
        {
            return true;
        }
        if(num%i==0)
        {
            return false;
        }
        if(i*i>num)
            return true;
        return check(num,i+1);
    }

    //second way of solving
    static boolean checkPrime(int num, int i)
    {
        if(num==i)
        {
            return true;
        }
        if(num<i)
        {
            return false;
        }
        if(i<=Math.sqrt(num))
        {
            if(num%i==0)
            {
                return false;
            }
            return checkPrime(num,i+1);
        }
        return true;
    }
}
