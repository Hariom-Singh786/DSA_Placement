package Searching;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int [] array= {4, 5, 6, 7, 1, 2, 3};
        int target=9;
        System.out.println(search(array,0,array.length-1,target));
    }
   static int search(int [] array, int lo, int hi, int target)
    {
        if(lo>hi)
        {
            return -1;
        }

        int mid= lo+(hi-lo)/2;
        if(array[mid]==target)
            return mid;
        if(array[lo]<=array[mid])//arr[lo.....mid]//sorted
        {
            if(target>=array[lo] && target <=array[mid])
                return search(array,lo,mid-1,target);
            return search(array,mid+1, hi,target);
        }
        //if array[mid+1....hi] is sorted
        if(target>=array[mid] && target<=array[hi])
            return search(array,mid+1, hi,target);

        return search(array,lo, mid-1,target);

    }
}
