package Recursion.SubsetSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        String str= "abc";
//        subset("",str);
        ArrayList<String> ans= subsetWithAscii("",str);
        System.out.println(ans);
    }
    static void subset(String ans,String input)
    {
        if(input.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch= input.charAt(0);
        //take it
        subset(ans+input.charAt(0),input.substring(1));
        //don't take it
        subset(ans,input.substring(1));
    }
    static ArrayList<String> subset2(String up,String p)
    {
        ArrayList<String> ans= new ArrayList<>();
        if(p.isEmpty())
        {
            ans.add(up);
            return ans;
        }
        char ch= p.charAt(0);
        //take it
        ArrayList<String>first=subset2(up+ch,p.substring(1));
        //don't take it
        ArrayList<String>sec=subset2(up,p.substring(1));
        first.addAll(sec);
        return first;
    }
    static ArrayList<String> subsetWithAscii(String up,String p)
    {
        ArrayList<String> ans= new ArrayList<>();
        if(p.isEmpty())
        {
            ans.add(up);
            return ans;
        }
        char ch= p.charAt(0);
        ArrayList<String>one=subset2(up+ch,p.substring(1));
        ArrayList<String>two=subsetWithAscii(up,p.substring(1));
        ArrayList<String>three= subsetWithAscii(up+(ch+0),p.substring(1));
        one.addAll(two);
        one.addAll(three);
        return one;
    }

}
