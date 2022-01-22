package Recursion.SubsetSubsequence;
// skipp "app" when not "apple"
public class SkipPattern2 {
    public static void main(String[] args) {
        String str= "helloapple";
        System.out.println(str);
        System.out.println(skip(str));
        String str2="heyapp";
        System.out.println(str2);
        System.out.println(skip(str2));
    }
    static String skip(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple"))
        {
            return skip(up.substring(3));
        }
        return up.charAt(0) +skip(up.substring(1));
    }
}
