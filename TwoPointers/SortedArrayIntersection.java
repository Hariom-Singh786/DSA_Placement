package TwoPointers;
import java.util.*;
public class SortedArrayIntersection {
    public static void main(String[] args) {
        int [] A= {1,3,4,5,};
        int [] B= {2,5,6};
        System.out.println(intersection(A,B));
    }
    static List<Integer> intersection (int[] A, int[] B) {
        ArrayList<Integer>ls= new ArrayList<>();
        int n=A.length;
        int m=B.length;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(A[i]==B[j])
            {
                ls.add(A[i++]);
                j++;
            }
            else if(A[i]<B[j])
            {
                i++;
            }
           else if(A[i]>B[j])
            {
                j++;
            }
        }
        return ls;
    }
}
