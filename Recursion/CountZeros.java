package Recursion;
// 12103202320-> 3
public class CountZeros {
    public static void main(String[] args) {
        int count=0;
        System.out.println(count(10808800,count));
    }
    static int count(int num,int cnt)
    {
       if(num==0) {
           return cnt;
       }
       if(num%10==0)
       {
           return count(num/10,++cnt);
       }else{
           return count(num/10,cnt);
       }
    }
}
