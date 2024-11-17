import java.util.Scanner;

public class roughpractice {
    static boolean won(char[][] tic,char player,int row,int col){
        if(tic[0][col]==player&&tic[1][col]==player&&tic[2][col]==player){
            return true;
        }
         if(tic[row][0]==player&&tic[row][1]==player&&tic[row][2]==player){
            return true;
         }
        if(tic[0][0]==player&&tic[1][1]==player&&tic[2][2]==player){
            return true;
        }
        if(tic[0][2]==player&&tic[1][1]==player&&tic[2][0]==player){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        char[][] tic=new char[3][3];
        Scanner sc=new Scanner(System.in);
        char c='y';
        char player='x';
       while(c=='y'){
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the column");
        int col=sc.nextInt();
        if(tic[row][col]!='x'&&tic[row][col]!='o'){
            tic[row][col]=player;
            if(won(tic,player,row,col)){
                System.out.println("you won:"+player);
                break;
            }
        }
        else{
            System.out.println("Invalid move");
        }
        player=player=='x'?'o':'x';
        System.out.println("Do you want to contine y/n");
        c=sc.next().charAt(0);
     }    }
}
