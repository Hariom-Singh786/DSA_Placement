package Recursion.Pepcoding_recursion_backtracking;

import java.util.Scanner;

public class MaximumNumberAfterKSwaps {
    static String max;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String  str= sc.next();
        max=str;
        int k=sc.nextInt();
        findMaximum(str,k);
        System.out.println(max);
    }
    static void findMaximum(String str, int k)
    {
        if(Integer.parseInt(str)>Integer.parseInt(max)) //it is used to convert string to integer
        {
            max=str;
        }
        if(k==0)
        {
            return;
        }
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
               str =swap(str,i,j);
                findMaximum(str,k-1);
                str=swap(str,i,j); //this is backtracking
            }
        }
    }
    static String swap(String str, int i, int j)
    {
        char ith=str.charAt(i);
        char jth= str.charAt(j);
        String left=str.substring(0,i);
        String middle= str.substring(i+1,j);
        String right=str.substring(j+1);
        return left+jth+middle+ith+right;
    }
}
