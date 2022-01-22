package Recursion.Pepcoding_recursion_backtracking;

import java.util.ArrayList;
import java.util.Scanner;

//you are given an array of elements and have to make K partition with care of the sum of each partition should be equal
public class EqualSumSubsetPartition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int k=sc.nextInt();
        //if k==1 then whole array is my answer
        if(k==1)
        {
            System.out.print("[");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+", ");
            }
            System.out.println("]");
            return;
        }
        //if there are more subsets than number of elements in given array
        if(k>n || sum%k!=0)
        {
            //because we can't find any solution for this
            System.out.println("-1");
            return;
        }
        int []subsetSum= new int[k];
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            ans.add(new ArrayList<>());//I have added empty array List
        }
        solution(arr,0,n,k,subsetSum,0,ans);
    }
    static void solution(int []arr, int vidx,int n, int k, int[] subsetSum, int ssf,ArrayList<ArrayList<Integer>>ans)
    {
     if(vidx==arr.length)
     {
         if(ssf==k)
         {
             boolean flag=true;
             for(int i=0;i<subsetSum.length-1;i++)
             {
                 if(subsetSum[i]!=subsetSum[i+1])
                 {
                     flag=false;
                     break;
                 }
             }
             if(flag)
             {
                 for(ArrayList<Integer> partion:ans)
                 {
                     System.out.print(partion+ " ");
                 }
                 System.out.println();
             }
         }
         return;
     }

        for(int i=0;i<ans.size();i++)
        {
            if(ans.get(i).size()>0)
            {
                ans.get(i).add(arr[vidx]);
                subsetSum[i]+=arr[vidx];
                solution(arr,vidx+1,n,k,subsetSum,ssf,ans);
                subsetSum[i]-=arr[vidx];
                ans.get(i).remove(ans.get(i).size()-1);
            }
            else{
                ans.get(i).add(arr[vidx]);
                subsetSum[i]+=arr[vidx];
                solution(arr,vidx+1,n,k,subsetSum,ssf+1,ans);
                subsetSum[i]-=arr[vidx];
                ans.get(i).remove(ans.get(i).size()-1);
                break;
            }
        }
    }
}
