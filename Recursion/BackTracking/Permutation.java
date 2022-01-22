package Recursion.BackTracking;

import java.util.Scanner;

//finding permutation using backtracking
public class Permutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //test cases
        int t= sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();
            findPermutation(str,0,str.length()-1);
        }
    }
    static void  findPermutation(String str, int left, int right)
    {
        //base case
        if(left==right)
        {
            System.out.println(str);
            return;
        }
            for(int i=left;i<=right;i++)
            {
                //swapping
                str=swap(str,left,i);
                //recursion call
                findPermutation(str,left+1,right);
                //undo changes or backtrack
                str=swap(str,left,i);
            }
    }
    static String swap(String str,int i, int j)
    {
        //we have to convert String to char array before making any changes to it
        char[]strArray=str.toCharArray();
        char temp=strArray[i];
        strArray[i]=strArray[j];
        strArray[j]=temp;
        return String.valueOf(strArray); //it converts char Array to string again
    }
}
