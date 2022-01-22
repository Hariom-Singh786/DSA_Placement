package workATtech;

import java.util.ArrayList;
import java.util.List;

//https://workat.tech/problem-solving/practice/even-number-of-digits
public class EvenNumberOfDigits {
    public static void main(String[] args) {
//        Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
//        Answer: 42, 5775, 34, 45, 3556
        int [] arr= {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
        List<Integer>ls= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int countDig=0;
            int temp=arr[i];
            while(temp>0)
            {
                temp=temp/10;
                countDig++;
            }
            if(countDig%2==0)
            {
                ls.add(arr[i]);
            }
        }
        System.out.println(ls);
    }
}
