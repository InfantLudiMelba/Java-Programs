import java.util.*;
class bore{
int dr[]={0,0,1,-1};
int dc[]={1,-1,0,0};
List<List<int[]>>ppp=new ArrayList<>();
Queue<List<int[]>>q=new LinkedList<>();
List<int[]>in=new ArrayList<>();
public List<List<int[]>> sol(int[][] mat,int[] so,int[] des){
    in.add(so);
    q.offer(in);
    return f(mat,so,des);
}
public List<List<int[]>> f(int[][] mat,int[] so,int[] des){
    while(q.size()!=0){
        List<int[]>cur=new ArrayList<>();
        cur=q.poll();
        int[] c=cur.get(cur.size()-1);
        if(c[0]==des[0]&&c[1]==des[1]){
        ppp.add(new ArrayList<>(cur));
        }
        for(int i=0;i<4;i++){
        int nrow=c[0]+dr[i];
        int ncol=c[1]+dc[i];
        if(nrow>=mat.length||nrow<0||ncol<0||ncol>=mat[0].length){
            continue;
        }
        if(mat[nrow][ncol]!=mat[so[0]][so[1]]){
            continue;
        }
        if(visit(cur,nrow,ncol)){
            continue;
        }
        List<int[]>nl=new ArrayList<>(cur);
        nl.add(new int[]{nrow,ncol});
        q.offer(nl);
        }
        
    }
    return ppp;
}
public boolean visit(List<int[]>cur,int row,int col){
    for(int[] cell:cur){
      if(cell[0]==row&&cell[1]==col){
        return true;
      }
    }
    return false;
}
}
public class boringrough {
    public static void main(String[] args){
    bore b=new bore();
    int[][] mat={{1,1,1,1},{1,0,0,1},{1,1,1,1},{0,0,0,1}};
    int[] so={0,0};
    int[] des={3,3};
    List<List<int[]>> p=b.sol(mat,so,des);
    System.out.println("Count:"+p.size());
    for(List<int[]> path:p){
        for(int[] cell:path){
        System.out.print(Arrays.toString(cell));
        }
        System.out.println();
    }
    }
}
