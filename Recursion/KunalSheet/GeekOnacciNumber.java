package Recursion.KunalSheet;

import java.util.Scanner;
public class GeekOnacciNumber {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int N=sc.nextInt();

            int sum=0;
            for(int j=4;j<=N;j++)
            {
                sum=a+b+c;
                a=b;
                b=c;
                c=sum;
                sum=0;
            }
            System.out.println(c);
        }
    }
}
