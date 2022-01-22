package Searching;

public class Ceiling {
    public static void main(String[] args) {
     int [] arr= {1, 2, 3, 3, 4, 4, 8, 10};
     int key= 4;
        System.out.println(ceilSearch(arr,0,arr.length-1,key));
    }

    static int ceilSearch(int arr[], int low, int high, int x)
    {
        int mid;
        if(x <= arr[low])
            return low;
        if(x > arr[high])
            return -1;
        mid = (low + high)/2;

        if(arr[mid] == x)
            return mid+1;
        else if(arr[mid] < x)
        {
            if(mid + 1 <= high && x <= arr[mid+1])
                return mid + 1;
            else
                return ceilSearch(arr, mid+1, high, x);
        }
        else
        {
            if(mid - 1 >= low && x > arr[mid-1])
                return mid+1;
            else
                return ceilSearch(arr, low, mid - 1, x);
        }
    }
}
