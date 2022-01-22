package Recursion.Pepcoding_recursion_backtracking;

import java.util.HashMap;
import java.util.Scanner;

//you are given a string of length 'n' print all the palindromic permutation of string if not possible then print -1
public class PalindromicPermutation {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int test= sc.nextInt();
        while(test-->0) {
                    String str = sc.next();
                    HashMap<Character, Integer> map = new HashMap<>();
                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);
                        if (map.containsKey(ch)) {
                            int of = map.get(ch);
                            map.put(ch, of + 1);
                        } else {
                            map.put(ch, 1);
                        }
                    }
                    Character odd = null;
                    int odds = 0;
                    int len = 0;
                    for (char ch : map.keySet()) {
                        int freq = map.get(ch);
                        if (freq % 2 == 1) {
                            odd = ch;
                            odds++;
                        }
                        map.put(ch, freq / 2);
                        len += freq / 2;
                    }
                    if (odds > 1) {
                        System.out.println(-1);
                        return;
                    }
                    generatepw(1, len, map, odd, "");
        }
    }

    private static void generatepw(int cs, int ts, HashMap<Character, Integer> map, Character oddc, String asf) {
        if(cs>ts)
        {
            StringBuilder rev= new StringBuilder();
            for(int i=asf.length()-1;i>=0;i--)
            {
                rev.append(asf.charAt(i)); //rev+=asf.charAt(i)
            }
            String ans=asf;
            if(oddc!=null)
            {
                ans+=oddc;
            }
            ans+=rev;
            System.out.println(ans);
            return;
        }

        for(char ch:map.keySet())
        {
            int freq=map.get(ch);
            if(freq>0)
            {
                map.put(ch,freq-1);
                generatepw(cs+1,ts,map,oddc,asf+ch);
                //backtrack
                map.put(ch,freq);
            }
        }
    }
}
