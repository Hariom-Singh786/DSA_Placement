package TwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KSubstringVowels {
    public static void main(String[] args) {
        String s= "helloworld";
        int k=3;
        System.out.println(Arrays.toString(kSubstringVowels(s,k)));
    }
   static int[] kSubstringVowels (String s, int k) {
       int []arr= new int[s.length()-k+1];
       int count=0;
       for(int i=0;i<k;i++)
       {
           count+=isVowel(s.charAt(i));
       }
       arr[0]=count;
       for(int i=k;i<s.length();i++)
       {
           count= count-isVowel(s.charAt(i-k))+isVowel(s.charAt(i));
           arr[i-k+1]=count;
       }
       return arr;
   }
   static int isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return 1;
        }
        return 0;
    }
}
