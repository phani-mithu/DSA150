import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ValidSudoko {
    public static void main(String[] args) {

    }
    public static boolean appendinrowcolumn(ArrayList<ArrayList> rc,int index,int val){
        if(rc.get(index).indexOf(val)==-1)
            rc.get(index).add(val);
        else
            return false;
        return true;
    }
    public static boolean appendinbox(ArrayList<ArrayList> box,int row,int col,int val){
    int boxno=(row/3)+(col/3);
    if(box.get(boxno).indexOf(val)!=-1)
        return false;
    box.get(boxno).add(val);
    return  true;
    }
    public static boolean isValidSudoku(char[][] board) {
        ArrayList<ArrayList> row=new ArrayList<>();
        ArrayList<ArrayList> col=new ArrayList<>();
        ArrayList<ArrayList> box=new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            ArrayList tempr=new ArrayList();
            ArrayList tempc=new ArrayList();
            ArrayList tempb=new ArrayList();
            col.add(tempc);
            box.add(tempb);
            row.add(tempr);
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c=board[i][j];
                if(c=='.')
                    continue;
                if(!appendinrowcolumn(row,i,c))
                {
                    System.out.println("row "+i+c);
                    return false;
                }
                if(!appendinrowcolumn(col,j,c))
                {
                    System.out.println("col "+i+c);
                    return false;
                }
                if(!appendinbox(box,i,j,c));
                {
                    System.out.println("box "+i+c);
                    return false;
                }
            }
        }
        return true;
    }
}
