package Recursion.SubsetSubsequence;

public class SkipPattern {
    public static void main(String[] args) {
        String str= "bananaapplekaisehoapple";
        System.out.println(erase("",str));
    }
    static String erase(String p,String up)
    {
        if(up.isEmpty())
        {
            return p;
        }
        if(up.startsWith("apple"))
        {
           return erase(p,up.substring(5));
        }

            return erase(p+up.charAt(0),up.substring(1));

    }
}
