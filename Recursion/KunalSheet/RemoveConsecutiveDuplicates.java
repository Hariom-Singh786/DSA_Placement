package Recursion.KunalSheet;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String s= "aaabbcccccdeff";
        System.out.println(removeDuplicates(s));
    }
        static String removeDuplicates(String s)
        {
            if(s.length()<=1)
            {
                return s;
            }
            if(s.charAt(0)==s.charAt(1))
            {
               return removeDuplicates(s.substring(1));
            }
          return s.charAt(0) + removeDuplicates(s.substring(1));
        }
}
