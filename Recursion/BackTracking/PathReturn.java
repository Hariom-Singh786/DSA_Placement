package Recursion.BackTracking;

import java.util.ArrayList;

//let's assume that we are taking 3 directions for any queen to move -> left & right & diagonal
public class PathReturn {
    public static void main(String[] args) {
        System.out.println(paths("",3,3));
    }
    static ArrayList<String> paths(String p,int r, int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(r>1)
        {
            list.addAll(paths(p+'V', r-1,c));
        }
        if(c>1)
        {
            list.addAll(paths(p+'H',r,c-1));
        }
        if(r>1 && c>1)
        {
            list.addAll(paths(p+'D',r-1,c-1));
        }
        return list;
    }
}
