package Recursion.SubsetSubsequence;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
       dice("",3);
        System.out.println(diceList("",4));
    }
    static void dice(String ans,int target)
    {
        if(target==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            dice(ans+i,target-i);
        }
    }
    static ArrayList<String> diceList(String ans,  int target)
    {
        ArrayList<String> list= new ArrayList<>();
        if(target==0)
        {
            list.add(ans);
            return list;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            list.addAll(diceList(ans+i, target-i));
        }
        return list;
    }
}
