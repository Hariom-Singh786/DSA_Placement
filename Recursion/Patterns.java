package Recursion;

public class Patterns {
    public static void main(String[] args) {
        int num=7;
//        printStars(num,0);
        starIncreasing(5,0);
    }
    static void printStars(int n, int count)
    {
        if(n==0)
        {
            return;
        }
        if(count<n)
        {
            System.out.print("*");
            printStars(n,count+1);
        }
        else{
            System.out.println();
            printStars(n-1,0);
        }
    }
    static void starIncreasing(int n,int count)
    {
        if(n==0)
        {
            return;
        }
        if(count<n)
        {
            starIncreasing(n,count+1);
            System.out.print(count);
        }
        else{
            starIncreasing(n-1,0);
            System.out.println();
        }
    }
}
