package Recursion.KunalSheet;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char [] s= {'h','a','r','i','o','m'};
        // this is the one way of doing
//        int n=s.length;
//        for(int i=0;i<n/2;++i)
//        {
//            char temp=s[i];
//            s[i]=s[n-1-i];
//            s[n-1-i]=temp;
//        }
//        System.out.println(Arrays.toString(s));

        //2nd way using recursion

    }
    static void reverse(char[]ch,int start, int end)
    {
        if(start>end)
        {
            return;
        }
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
        reverse(ch,start+1,end-1);
    }
}
