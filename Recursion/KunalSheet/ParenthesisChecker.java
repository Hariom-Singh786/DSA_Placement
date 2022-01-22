package Recursion.KunalSheet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            String str= sc.next();
            if(ispar(str))
            {
                System.out.println("Balanced");
            }
            else{
                System.out.println("Not Balanced");
            }
        }
    }
    static boolean ispar(String x) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (ch) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                }
            }
        }
        return (stack.isEmpty());
    }
}
