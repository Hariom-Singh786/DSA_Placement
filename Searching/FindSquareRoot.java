package Searching;

public class FindSquareRoot {
    public static void main(String[] args) {
        int num= 0;
        int high=10000;
        System.out.println(squareRoot(1,high,num));
    }
    static int  squareRoot(int lo, int hi, int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(mid*mid==num)
            {
                return mid;
            }
            else if(mid*mid>num)
            {
                return squareRoot(lo,mid-1,num);
            }
            else{
                return squareRoot(mid+1,hi,num);
            }
        }
        return hi;
    }
}
