package TwoPointers;

public class GetKthElement {
    public static void main(String[] args) {
       int [] A= {1, 2, 3, 4, 5, 6};
        int [] B = {3, 4, 4, 5, 6, 6};
        int k= 13;
        System.out.println(getKthElement(A,B,k)); //{1,2,3,3,4,4,4,5,5,6,6,6} k=4=>3
    }
   static int getKthElement(int[] firstArr, int[] secondArr, int k) {
        int n=firstArr.length;
        int m=secondArr.length;
        int []ans=new int[n+m];
        int i=0,j=0,id=0;
        while(i<n && j<m)
        {
            if(firstArr[i]<=secondArr[j])
            {
                ans[id++]=firstArr[i++];
            }
            else if(firstArr[i]>secondArr[j])
            {
                ans[id++]=secondArr[j++];
            }
        }
        while(i<n)
        {
            ans[id++]=firstArr[i++];
        }
        while(j<m)
        {
            ans[id++]=secondArr[j++];
        }
        //now I have sorted merged Array
       if(k<1 || k>ans.length)
       {
           return 0;
       }
        int x=0;
        while(x<k-1)
        {
            x++;
        }
        return ans[x];
    }
}
