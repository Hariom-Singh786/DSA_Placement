package RandomPractice;

public class Search {
    public static void main(String[] args) {
        int []nums= {-1,0,3,5,9,12};
        int target=1;
        int s=0;
        int e=nums.length-1;
        System.out.println(binarySearch(nums,s,e,target));
    }
    static int binarySearch(int [] nums, int s, int e, int key)
    {
        if(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==key)
            {
                return mid;
            }
            if(nums[mid]<key)
            {
                return binarySearch(nums,mid+1,e,key);
            }
            return  binarySearch(nums,s,mid-1,key);
        }
        return -1;
    }

}
