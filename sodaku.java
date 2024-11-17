class game{
    public boolean check(int[][] sodakuGrid){
    for(int i=0;i<9;i++){
        if(!isvalidrow(sodakuGrid,i)||!isvalidcol(sodakuGrid,i)){
            return false;
        }
    }
    for(int i=0;i<9;i+=3){
        for(int j=0;j<9;j+=3){
        if(!isgridvalid(i,j,sodakuGrid)){
            return false;
        }
        }
    }
    return true;
}
public boolean isvalidrow(int[][] m,int row){
    boolean visited[]=new boolean[10];
    for(int i=0;i<9;i++){
        int num=m[row][i];
        if(num!=0&&visited[num]){
            return false;
        }
        visited[num]=true;
    }
    return true;
}
public boolean isvalidcol(int[][] m,int col){
    boolean visited[]=new boolean[10];
    for(int i=0;i<9;i++){
        int num=m[i][col];
        if(num!=0&&visited[num]){
            return false;
        }
        visited[num]=true;
    }
return true;
}
public boolean isgridvalid(int row,int col,int[][] m){
    boolean visited[]=new boolean[10];
    for(int i=row;i<row+3;i++){
        for(int j=col;j<col+3;j++){
        int num=m[i][j];
        if(num!=0&&visited[num]){
            return false;
        }
        visited[num]=true;
        }
    }
    return true;
}
}
public class sodaku{
    public static void main (String[] args){
        int[][] sudokuGrid = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        game g=new game();
        if(g.check(sudokuGrid)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}