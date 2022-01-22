package TwoPointers;

public class RemoveOccurences {
    public static void main(String[] args) {
        int [] arr= {1, 1, 1, 2, 2};
        int k=1;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
