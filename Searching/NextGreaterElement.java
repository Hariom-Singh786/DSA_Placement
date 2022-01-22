package Searching;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr= {1, 2, 3, 3, 3, 4, 4, 5};
        int key=-4;
        System.out.println(greaterElement(arr,key));
    }
    static int greaterElement(int [] arr , int key)
    {
        if(key<arr[0])
        {
            return arr[0];
        }
        if(key>=arr[arr.length-1])
        {
            return arr[arr.length-1];
        }
        int left = 0, right = arr.length - 1;
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (arr[mid] == key)
            {
                if(arr[mid+1]>key)
                {
                    return arr[mid+1];
                }
                else{
                    left=mid+1;
                }
            }
            else if(arr[mid]<key)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return arr[right];
    }
}
