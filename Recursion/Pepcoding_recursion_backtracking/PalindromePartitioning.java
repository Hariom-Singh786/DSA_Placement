package Recursion.Pepcoding_recursion_backtracking;

import java.util.Scanner;

public class PalindromePartitioning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        solution(str, "");
    }
    static void solution(String str, String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            String prefix=str.substring(0,i+1);
            String ros=str.substring(i+1);
            if(isPalindrome(prefix))
            {
                solution(ros,asf+"("+prefix+")");
            }
        }
    }
    static boolean isPalindrome(String pre)
    {
        int li=0;
        int ri=pre.length()-1;
        while(li<ri)
        {
            char left=pre.charAt(li);
            char right=pre.charAt(ri);
            if(left!=right)
            {
                return false;
            }
            li++;
            ri--;
        }
        return true;
    }
}
