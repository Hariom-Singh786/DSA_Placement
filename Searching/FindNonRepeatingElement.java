package Searching;

public class FindNonRepeatingElement {
    static int search(int[] arr, int low, int high) {
        if (low > high) {
            return 0;
        }
        if (low == high) {
            return arr[low];
        }
        int mid = low + (high - low) / 2;
        if (mid % 2 == 0) {
            if (arr[mid] == arr[mid + 1]) {
                return search(arr, mid + 2, high);
            } else {
                return search(arr, low, mid);
            }
        } else if (mid % 2 == 1) {
            if (arr[mid] == arr[mid - 1]) {
                return search(arr, mid + 1, high);
            } else {
                return search(arr, low, mid - 1);
            }
        }return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2,2, 3, 3, 4, 4};
        System.out.println(search(arr, 0, arr.length - 1));
    }
}
