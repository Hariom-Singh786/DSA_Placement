package workATtech;
//https://workat.tech/problem-solving/practice/cumulative-sum
import java.lang.reflect.Array;
import java.util.Arrays;

public class CumulativeSum {
//    Initial Array: [1, 2, 3, 4]
//    Cumulative Sum: [1, 3, 6, 10]
        public static void main(String[] args) {
            int [] arr= {1,2,3,4};
            System.out.println("Initial Array:"+Arrays.toString(arr));
            cumulativeSum(arr);

        }
        static void cumulativeSum(int [] arr)
        {
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
                arr[i]=sum;
            }
            //displaying arrays
            System.out.println("Cumulative sum Array: "+Arrays.toString(arr));
        }
}
