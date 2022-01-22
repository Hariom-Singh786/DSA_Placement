package Searching;

public class IsPerfectSquare {
    public static void main(String[] args) {
        int number= 36;
        System.out.println(isPerfectSquare(number));

    }
   static boolean isPerfectSquare (int num) {
        int low=1;
        int high=num;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mid*mid == num)
            {
                return true;
            }
            else if(mid*mid > num)
            {
                high=mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return false;
    }
}
