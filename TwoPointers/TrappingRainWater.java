package TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int []heights= { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(volumeOfTrappedRainWater(heights));
    }
   static int volumeOfTrappedRainWater(int[] heights) {
        int n=heights.length;
        if(n==1)
        {
            return 0;
        }
        int []left= new int[n];
        int []right=new int[n];

        left[0]=heights[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],heights[i]);
        }
        right[n-1]=heights[n-1];
        for(int j=n-2;j>=0;j--)
        {
            right[j]=Math.max(right[j+1],heights[j]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans +=(Math.min(left[i],right[i]) - heights[i]);
        }
        return ans;
    }
}
