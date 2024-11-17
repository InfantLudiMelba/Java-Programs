import java.util.LinkedList;
import java.util.*;
class path{
    Queue<Integer> rq=new LinkedList<>();
    Queue<Integer> cq=new LinkedList<>();
    int[] dr={-1,+1,0,0};
    int[] dc={0,0,+1,-1};
    boolean reached_end=false;
    int nodes_in_lefted_layers=1;
    int nodes_in_next_layers=0;
    int move_count=0;
    //dr matrix
    public void sol(int sr,int sc,int[][] m)//source row 
    {
    boolean[][] visited2=new boolean[m.length][m[0].length];
    rq.add(sr);
    cq.add(sc);
    visited2[sr][sc]=true;
    solve(m,visited2);
     }
    public void solve(int[][] m,boolean[][] visited2){
    while((rq.size()!=0)&&(cq.size()!=0)){
        int r=rq.remove();
        int c=cq.remove();
        if(r==0&&c==0){///have to take care this
         reached_end=true;
         //have to increase the count
         break;
        }
        explore_neighbours(r,c,visited2,m);
        nodes_in_lefted_layers--;
        if(nodes_in_lefted_layers==0){
            nodes_in_lefted_layers=nodes_in_next_layers;
            nodes_in_next_layers=0;
            move_count++;//take care of that
        }
    }
    if(reached_end){
        System.out.println("Found in move count:"+move_count);
    }
    else{
        System.out.println("No such path available");
    }
}
    public void explore_neighbours(int r,int c,boolean[][] visited2,int[][] m){
    for(int i=0;i<4;i++){
    int rr=r+dr[i];
    int cc=c+dc[i];
    if(rr<0||cc<0)
     continue;
    if(rr>=m.length||cc>=m[0].length)
     continue;
    if (visited2[rr][cc])
     continue;
    if(m[rr][cc]==1&&rr!=0&&cc!=0)
     continue;
    rq.add(rr);
    cq.add(cc);
    visited2[rr][cc]=true;
    nodes_in_next_layers++;
    }
    }
}
public class matrixpath {
    public static void main(String[] args){
    int[][] m={{1,0,0,1},{1,0,1,0},{1,1,1,0},{0,1,1,1}};
    path p=new path();
    p.sol(1,2,m);
    }
}
