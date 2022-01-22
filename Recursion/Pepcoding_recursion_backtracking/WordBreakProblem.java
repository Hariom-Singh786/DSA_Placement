package Recursion.Pepcoding_recursion_backtracking;

import java.util.HashSet;
import java.util.Scanner;

public class WordBreakProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<String> dict=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            dict.add(sc.next());
        }
        String sentence = sc.next();
        solution(sentence,"",dict);
    }
    static void solution(String sentence, String ans,HashSet<String> dict )
    {
        //base case
        if(sentence.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<sentence.length();i++)
        {
            String left=sentence.substring(0,i+1);
            if(dict.contains(left))
            {
                String right=sentence.substring(i+1);
                solution(right,ans+left+" ",dict);
            }
        }
    }
}
