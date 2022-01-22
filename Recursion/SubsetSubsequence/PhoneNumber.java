package Recursion.SubsetSubsequence;

import java.util.ArrayList;

//letter combination of phone number
public class PhoneNumber {
    public static void main(String[] args) {
        letterCombination("","abc");

//        System.out.println(dialPad("","abc"));
    }
    static void letterCombination(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0) -'0';//converts alphabets to number
        for(int i= (digit-1)*3;i<digit*3;i++)
        {
            char ch= (char) (i+'a');//converts number to alphabet
            letterCombination(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> dialPad(String p, String up)
    {
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0';
        for(int i=(digit-1)*3 ; i<digit*3;i++)
        {
            char ch= (char)('a'+i);
            list.addAll(dialPad(p+ch,up.substring(1)));
        }
        return list;
    }
}
