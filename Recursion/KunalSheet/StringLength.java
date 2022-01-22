package Recursion.KunalSheet;
//program to find length of string using recursion
public class StringLength {
    public static void main(String[] args) {
//        System.out.println(lengthStr("hariom",0));
        strLength("hariom",0);
    }
    //return integer value
    static int lengthStr(String str, int count)
    {
        if(count==str.length())
        {
            return count;
        }
        return lengthStr(str,count+1);
    }
    //return nothing
    static void strLength(String str, int count)
    {
        if(count==str.length())
        {
            System.out.println(count);
            return;
        }
        strLength(str,count+1);
    }
}
