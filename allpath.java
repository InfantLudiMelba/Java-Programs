import java.util.*;
class paath{
    List<List<int[]>> allpaths=new ArrayList<>();
    Queue<List<int[]>> queue=new LinkedList<>();
    List<int[]> initialpath=new ArrayList<>();
    int[] dcol={0,0,1,-1};
    int[] drow={-1,1,0,0};
    public List<List<int[]>> solv(int[][] m,int[] source,int[] destination){
    initialpath.add(source);
    queue.offer(initialpath);
    return solvv(m,destination);
    }
    public List<List<int[]>> solvv(int[][] m,int[] destination){
        while(!queue.isEmpty()){
            List<int[]> currpath=queue.poll();
            int[] currpos=currpath.get(currpath.size()-1);
            if(currpos[0]==destination[0]&&currpos[1]==destination[1]){
                allpaths.add(new ArrayList<>(currpath));
            }
            for(int i=0;i<4;i++){
            int nextrow=currpos[0]+drow[i];
            int nextcol=currpos[1]+dcol[i];
            if(nextrow<0||nextcol<0||nextrow>=m.length||nextcol>=m[0].length){
            continue;
            }
            if(visited(currpath,nextrow,nextcol)){
            continue;
            }
            if(m[nextrow][nextcol]==0){
                continue;
            }
            List<int[]>newpath=new ArrayList<>(currpath);
            newpath.add(new int[]{nextrow,nextcol});
            queue.offer(newpath);
            }
        }
        return allpaths;
    }
    public boolean visited(List<int[]> path,int row,int col){
    for(int[] cell:path){
        if(cell[0]==row&&cell[1]==col){
            return true;
        }
    }
    return false;
    }
}
public class allpath {
    public static void main(String[] args){
        int[][] m={{1,1,1,1},{1,0,0,1},{1,1,1,1},{0,0,0,1}};
        paath p=new paath();
        int[] source={0,0};
        int count=0;
        int[] destination={3,3};
       List<List<int[]>> pp= p.solv(m,source,destination);
       /*for (List<int[]> path : pp) {
        System.out.print("Path: ");
        for (int[] cell : path) {
            System.out.print(Arrays.toString(cell) + " ");
        }
        count++;
        System.out.println();
    }*/
    System.out.println("Count is:"+pp.size());

    }
    }
