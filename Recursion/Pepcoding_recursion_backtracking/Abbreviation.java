package Recursion.Pepcoding_recursion_backtracking;

import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            String str= sc.next();
            solution(str,"",0,0);
        }
    }
    static void solution(String str, String ans, int count, int pos)
    {
        //base case
        if(pos==str.length())
        {
            if(count==0)
            {
                System.out.println(ans);
            }
            else{
                System.out.println(ans+count);
            }
            return;
        }
        //it calls when we say yes to include character
        if(count>0)
        {
            solution(str,ans+count+str.charAt(pos),0,pos+1);
        }else{
            solution(str,ans+str.charAt(pos),0,pos+1);
        }
        //it calls when we say no for the character
        solution(str,ans,count+1,pos+1);
    }
}
