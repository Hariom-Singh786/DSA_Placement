package workATtech;

public class MaxOnes {
    public static void main(String[] args) {
        int []A={1, 1, 3, 2, 3, 1, 1, 1};
        int maxcount=0;
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==1)
            {
                count++;
            }
            else{
                maxcount=Math.max(maxcount,count);
                count=0;
            }
        }
        maxcount= Math.max(maxcount,count);
        System.out.println(maxcount);
    }
}
