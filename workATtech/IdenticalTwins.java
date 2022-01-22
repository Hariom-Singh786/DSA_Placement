package workATtech;
//https://workat.tech/problem-solving/practice/identical-twins
public class IdenticalTwins {
    public static void main(String[] args) {
//        Array: [1, 2, 3, 2, 1]
//        Number of Identical Twins: 2
//        Explanation:
//        Identical Twins: [[1, 1], [2, 2]]
//        Indexes: (0, 4), (1, 3)

        //using naive approach
        int [] arr= {1,2,3,2,1};
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[i]==arr[j])
               {
                   count++;
               }
            }
        }
        System.out.println("Identical :"+count);
    }
}
