package Recursion.SubsetSubsequence;

import TwoPointers.KsubArraySum;

//remove all the a's appearing in the string
public class RemoveASelectedCharacter {
    public static void main(String[] args) {
     String str= "abcbsababababa";
     String ans= remove("",str);
        System.out.println(ans);
        remove1("",str);
    }
    static String remove(String p, String up)
    {
        if(up.isEmpty())
        {
            return p;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            return remove(p,up.substring(1));
        }
        else{
           return remove(p+ch, up.substring(1));
        }
    }
    //return void
    static void remove1(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p);
            return;
        }
        char ch= up.charAt(0);
        if(ch !='a')
        {
            remove1(p+ch,up.substring(1));
        }
        else{
            remove1(p,up.substring(1));
        }
    }
}
