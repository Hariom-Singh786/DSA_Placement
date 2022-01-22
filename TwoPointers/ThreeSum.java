package TwoPointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int []A= {1, -1, 9, -8, 0};
        System.out.println(threeSum(A));
    }
    static List<List<Integer>> threeSum(int[] A) {
        Set<List<Integer>> res = new HashSet<>();
        if (A.length < 3) {
            return new ArrayList<>(res);
        }
        Arrays.sort(A);// sorting array in ascending order
        int c = 0;
        for (int i = 0; i < A.length - 2; i++) {
            int j = i + 1;
            int k = A.length - 1;
            while (j < k) {
                int sum = A[j] + A[k];
                if (sum == -A[i]) {
                    ++c;
                    res.add(Arrays.asList(A[i], A[j++], A[k--]));

                } else if (sum < -A[i])
                    j++;
                else if (sum > -A[i])
                    k--;
            }
        }
        res.add(Arrays.asList(c));
        return new ArrayList<>(res);
    }
}
