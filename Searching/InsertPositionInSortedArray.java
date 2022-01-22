package Searching;
//https://workat.tech/problem-solving/practice/insert-position-in-sorted-array
public class InsertPositionInSortedArray {
    public static void main(String[] args) {
        int [] arr= {1, 2, 5, 7, 9};
        int key =8;
        System.out.println(findPosition(arr,key));
    }
    static int findPosition(int []arr, int key)
    {
        int left=0;
        int right= arr.length-1;
        if(key<arr[0])
        {
            return left;
        }
        if(key>arr[right])
        {
            return right+1;
        }
        while(left<=right)
        {
            int  mid=left+(right-left)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key && arr[mid-1]<key)
            {
                return mid;
            }
            else if(arr[mid]<key && arr[mid+1]>key)
            {
                return mid+1;
            }
            else if(arr[mid]>key)
            {
                right=mid-1;
            }
            else{
                left= mid+1;
            }
        }
        return left;
    }
}
