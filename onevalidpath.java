import java.util.*;
class path{
    List<int[]> pathp =new ArrayList<>();
    Queue<List<int[]>> queue=new LinkedList<>();
    int[] drow={-1,1,0,0};
    int[] dcol={0,0,1,-1};
    public List<int[]> sol(int[][]m){
    List<int[]> initial=new ArrayList<>();
    initial.add(new int[]{0,0});
    queue.offer(initial);
    //System.out.println("hi1");
    return solve(m);
    }
    public List<int[]> solve(int[][] m){
        while(queue.size()!=0){
            List<int[]> curpath=new ArrayList<>();
            curpath=queue.poll();
            int[] curpos=curpath.get(curpath.size()-1);
            if(curpos[0]==m.length-1&&curpos[1]==m[0].length-1){
                //System.out.println("hi");
                pathp=curpath;
                //pathp.add(new ArrayList<>(curpath));
                break;
            }
            for(int i=0;i<4;i++){
            int newrow=curpos[0]+drow[i];
            int newcol=curpos[1]+dcol[i];
            if(newrow<0||newcol<0||newrow>=m.length||newcol>=m[0].length){
                continue;
            }
            if(m[newrow][newcol]!=m[0][0]){
            continue;
            }
            if(visited(curpath,newrow,newcol)){
                continue;
            }
            List<int[]> newpath=new ArrayList<>(curpath);
            newpath.add(new int[]{newrow, newcol});
            queue.offer(newpath);
          }
            
        }
        return pathp;
    }
    public boolean visited(List<int[]>path,int row,int col){
        for(int[]cell:path){
            if(cell[0]==row&&cell[1]==col){
                return true;
            }
        }
        return false;
    }
}
public class onevalidpath {
    public static void main(String[] args){
    int[][] m={{1,1,0,0},{1,0,0,1},{1,1,1,1},{0,0,0,1}};
    path p=new path();
    List<int[]>num=p.sol(m);
    //System.out.println("Size"+num.size());
    int i=0;
        int[] element=num.get(i);
        i++;
        for(int j=0;j<m.length;j++){
        for(int k=0;k<m[0].length;k++){
            if(element[0]==j&&element[1]==k){
                System.out.print("-");
                i++;
                if(i<num.size()){
                element=num.get(i);
                }
            }
            else{
                System.out.print(m[j][k]);
            }
        }
        System.out.println();
    }
    }
}
