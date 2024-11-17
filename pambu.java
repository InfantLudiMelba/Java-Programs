import java.util.*;
class nodel{
    int col=0;
    int row=0;
    nodel(int row,int col){
        this.row=row;
        this.col=col;
    }
    public int getrow(){
        return row;
    }
    public int getcol(){
        return col;
    }
}
class snakebabu{
char[][] board=null;
Queue<nodel> queue=new LinkedList<nodel>();
snakebabu(int r,int c){
    this.board=new char[r][c];
    this.board[1][0]='x';
    this.board[2][2]='x';
    this.board[3][4]='x';
    this.board[5][2]='x';
    queue.add(new nodel(0,0));
}
public void smove(int r,int c){
    System.out.println("Hi");
    if(r>=0&&r<board.length&&c>=0&&c<board[0].length){
        if(board[r][c]=='.'){
            System.out.println("GAme over");
            System.exit(0);
        }
        queue.add(new nodel(r,c));
        System.out.println("Hi");
        if(board[r][c]!='x'){
            nodel Node=queue.poll();
            int row=Node.getrow();
            int col=Node.getcol();
            board[row][col]='\0';
        }
        board[r][c]='.';
        while(queue.size()!=0){
            printsnake();
            System.out.println("Enter your chice");
            Scanner sc=new Scanner(System.in);
            char k=sc.next().charAt(0);
            if(k=='l'){
           smove(r,c+1);
            }
            if(k=='r'){
             smove(r,c-1);
            }
            if(k=='u'){
                smove(r-1,c);
            }
            if(k=='d'){
                smove(r+1,c);
            }
        }

    }
    else{
        System.out.println("Game Over");
    }
}
public void printsnake(){
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            System.out.print(board[i][j]+"  ");
        }
        System.out.println();
    }
}
}
public class pambu{
    public static void main(String[] args){
        snakebabu s=new snakebabu(6,6);
        s.smove(0,1);
    }
}