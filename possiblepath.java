import java.util.*;
class paaa{
    List<List<int[]>> alllpath=new ArrayList<>();
    Queue<List<int[]>> que=new LinkedList<>();
    int count=0;
    int[] dircol={0,0,1,-1};
    int[] dirrow={-1,1,0,0};
    public void func(int[][] m,int[] start,int[] end){
    List<int[]> initial=new ArrayList<>(); 
    initial.add(start);
    que.offer(initial);
    fun(m,start,end);
    }
    public void fun(int[][]m,int[] start,int[] end){
        while(que.size()!=0){
        List<int[]>curpath=new ArrayList<>();
        curpath=que.poll();
        int[] curpos=curpath.get(curpath.size()-1);
        if(curpos[0]==end[0]&&curpos[1]==end[1]){
         alllpath.add(curpath);
         count++;
        }
        for(int i=0;i<4;i++){
        int nextr=curpos[0]+dirrow[i];
        int nextc=curpos[1]+dircol[i];
        if(nextc<0||nextr<0||nextr>=m.length||nextc>=m[0].length){
            continue;
        }
        if(m[nextr][nextc]!=m[start[0]][start[1]]){
        continue;
        }
        if(visited(curpath,nextr,nextc)){
            continue;
        }
        List<int[]>newp=new ArrayList<>(curpath);
        newp.add(new int[]{nextr,nextc});
        que.offer(newp);
        }
    }
    System.out.println("No.of Possible paths are:"+count);
    }
    public boolean visited(List<int[]> path,int row,int col){
        for(int[]cell:path){
            if(cell[0]==row&&cell[1]==col){
                return true;
            }
        }
        return false;
    }
}
public class possiblepath{
    public static void main(String[] args){
        int[][] m={{1,1,1,1},{1,0,1,0},{1,1,1,0},{0,1,1,1}};
        int[] start={1,2};
        int[] end={0,0};
        paaa p=new paaa();
        p.func(m,start,end);
    }
}