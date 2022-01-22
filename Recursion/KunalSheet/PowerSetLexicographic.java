package Recursion.KunalSheet;


import java.util.Arrays;

public class PowerSetLexicographic {
    public static void main(String[] args) {
        String str= "cba";
        powerset(str);
    }
    static void powerset(String str)
    {
        //sorting string value by storing string value into character array
        char []arr=str.toCharArray();
        Arrays.sort(arr);
        permuteRec(new String(arr),str.length(),-1,"");
    }
    static void permuteRec(String str,int n, int index,String curr)
    {
        if(index==n)
        {
            return;
        }
        System.out.println(curr);
        for(int i=index+1;i<n;i++)
        {
            curr+=str.charAt(i);
            permuteRec(str,n,i,curr);
            //backtracking
            curr= curr.substring(0,curr.length()-1);
        }
    }
}
