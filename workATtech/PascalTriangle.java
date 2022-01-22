package workATtech;

import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int rowNo=-1;
        System.out.println(Arrays.toString(pascal(rowNo)));
    }
   static int[] pascal(int rowNo) {
        int [] arr= new int[rowNo+1];
        for(int i=0;i<=rowNo;i++)
        {
            arr[i]=nCr(rowNo,i);
        }
        return arr;
    }
    static int nCr(int n, int r)
    {
        r= Math.min(r,n-r);
        long ans = 1;
        for(int i=0;i<r;i++)
        {
            ans *=(n-i);
            ans/=(i+1);
        }
        return (int)ans;
    }
}
