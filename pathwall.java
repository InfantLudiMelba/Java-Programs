import java.util.*;
class route{
Queue<Integer> rrq=new LinkedList<>();
Queue<Integer> ccq=new LinkedList<>();
int ddr[]={0,1};
int ddc[]={1,0};
int next_layer=0,pre_layer=1;
public void solve(int[][] m){
boolean[][] visit=new boolean[m.length][m[0].length];
rrq.add(0);
ccq.add(0);
visit[0][0]=true;
sol(m,visit);
}
public void sol(int[][] m,boolean[][] visit){
while(rrq.size()!=0&&ccq.size()!=0){
    int r=rrq.remove();
    int c=ccq.remove();
    if(r==4&&c==4){
        System.out.println("Yes");
        break;
    }
    neighbour(r,c,m,visit);
    pre_layer--;
    if(pre_layer==0){
        pre_layer=next_layer;
        next_layer=0;
    }
}
}
public void neighbour(int r,int c,int[][] m,boolean[][] visit){
for(int i=0;i<2;i++){
 int rrr=r+ddr[i];
 int ccc=c+ddc[i];
 if(rrr<0||ccc<0)
  continue;
 if(rrr>=m.length||ccc>=m[0].length)
  continue;
  if(visit[rrr][ccc])
   continue;
  if(m[rrr][ccc]==0)
   continue;
  rrq.add(rrr);
  ccq.add(ccc);
  visit[rrr][ccc]=true;
  next_layer++;
}
}
}
public class pathwall {
    public static void main(String[] args){
    route r=new route();
    int[][] m={{1,0,1,0,0},{1,1,1,1,1},{0,0,0,1,0},{1,0,1,1,1},{0,1,1,0,1}};
    r.solve(m);
    }
}
