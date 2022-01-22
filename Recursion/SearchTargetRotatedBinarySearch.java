package Recursion;
//[5,6,7,8,9,1,2,3] -> Rotated sorted Array
public class SearchTargetRotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr= {5,6,7,8,9,1,2,3};
        System.out.println(rotatedSearch(arr,1,0,arr.length-1));
    }
    static int rotatedSearch(int[]arr, int key,int s, int e)
    {
        int mid=s+(e-s)/2;
        if(s>e)
        {
            return -1;//key value is not found
        }
        if(key==arr[mid])
        {
            return mid;
        }
        //if first array before mid is sorted
        if(arr[s]<=arr[mid])
        {
            //if my key value lies between this range from start to mid
            if(key>=arr[s] && key<=arr[mid])
            {
                return rotatedSearch(arr,key,s,mid-1);
            }
            else{
                return  rotatedSearch(arr,key,mid+1,e);
            }
        }
        //my value life between this range form mid to end
        else if(key>=arr[mid] && key <=arr[e])
        {
            return rotatedSearch(arr,key,mid+1,e);
        }
        else{
            return rotatedSearch(arr,key,s,mid-1);
        }
    }
}
