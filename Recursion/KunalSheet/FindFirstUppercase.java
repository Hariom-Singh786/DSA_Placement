package Recursion.KunalSheet;
//given a string find first uppercase letter in the string and return it
public class FindFirstUppercase {
    public static void main(String[] args) {
        String str= "hariMsinghH";
        System.out.println(found(str,0));
    }
    static char found(String str, int i)
    {
        if(str.charAt(i)=='\0'){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        try {
            return found(str, i + 1);
        }
        catch(Exception e){
            System.out.println("Exception occures");
        }
        return 0;
    }
}
