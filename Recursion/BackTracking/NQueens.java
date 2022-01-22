package Recursion.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        nQueens(new boolean[5][5],0,0,5,0,"");
    }
    static void nQueens(boolean [][]board, int row, int col, int tq, int qpst,String ans)
    {
        if(qpst==tq)
        {
            System.out.println(ans);
            return;
        }
        if(col==board[0].length)
        {
            row++;
            col=0;
        }
        if(row==board.length)
        {
            return;
        }
        //placing queens
        if(isSafeToPlace(board, row,  col))
        {
            //do placing
            board[row][col]=true;
            //recursion
            nQueens(board,row,col+1,tq,qpst+1,ans+"["+row+" , "+col+"]");
            //undo
            board[row][col]=false;
        }
        //if not placed
        nQueens(board,row,col+1,tq,qpst,ans);
    }
    static boolean isSafeToPlace(boolean[][]board, int row, int col)
    {
        //vertical upward
        int r=row-1;
        int c=col;
        while(r>=0)
        {
            if(board[r][c])// means true or already queen is placed
            {
                return false;
            }
            r--;
        }
        //horizontal left
        r=row;
        c=col-1;
        while(c>=0)
        {
            if(board[r][c])
            {
                return false;
            }
            c--;
        }
        //diagonally left
        r=row-1;
        c=col-1;
        while(r>=0 && c>=0)
        {
            if(board[r][c])
            {
                return false;
            }
            r--;c--;
        }
        //diagonally right
        r=row-1;
        c=col+1;
        while(r>=0 && c<board[0].length)
        {
            if(board[r][c])
            {
                return false;
            }
            r--;c++;
        }
        return true;
    }
}
