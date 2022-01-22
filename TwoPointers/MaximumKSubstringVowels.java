package TwoPointers;

public class MaximumKSubstringVowels {
    public static void main(String[] args) {
        String str= "substring";
        int k=2;
        System.out.println(maxKSubstringVowels(str,k));
    }
   static int maxKSubstringVowels (String s, int k) {
        int n=s.length();
        int maxVowel= -1;
        int []temp= new int[n-k+1];
        int count=0;
        for(int i=0;i<k;i++)
        {
            count+=isVowels(s.charAt(i));
        }
        maxVowel=Math.max(maxVowel,count);
        temp[0]=count;
        for(int i=k;i<n;i++)
        {
            count= count-isVowels(s.charAt(i-k))+isVowels(s.charAt(i));
            maxVowel=Math.max(maxVowel,count);
            temp[i-k+1]=count;
        }
        return maxVowel;
    }
    static int isVowels(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i'||ch=='o' ||ch=='u')
        {
            return 1;
        }
        return 0;
    }
}
