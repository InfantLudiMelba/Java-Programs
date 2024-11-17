import java.util.*;
class graph{
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>(); 
    graph(int v){
     for(int i=0;i<v;i++){
      adj.add(new ArrayList<Integer>());
     }
    }
    public void addedge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public void printq(){
        for(int i=0;i<adj.size();i++){
            System.out.print("In the vertex "+i+":");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    public void bfsfun(int v){
        int V=adj.size();
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(v);
        visited[v]=true;
        while(q.size()!=0){
        int vertex=q.remove();
        System.out.print("\t"+vertex);
        for(int i=0;i<adj.get(vertex).size();i++){
        int av=adj.get(vertex).get(i);
        if(!visited[av]){
            q.add(av);
            visited[av]=true;
        }
        }
        }
    }
    public void dfsfun(int v){
        int V=adj.size();
        boolean[] visited1=new boolean[V];
        dfs(v,visited1);
    }
    public void dfs(int v,boolean[] visited1){
        visited1[v]=true;
        System.out.print("\t"+v);
        for(int i=0;i<adj.get(v).size();i++){
            int av=adj.get(v).get(i);
            if(!visited1[av]){
                dfs(av,visited1);
            }
        }
    }
}
public class bfs {
    public static void main(String[] args){
    graph g=new graph(5);
    g.addedge(0,1);
    g.addedge(2,3);
    g.addedge(1, 2);
    g.addedge(3, 4);
    g.addedge(0, 4);
    g.addedge(1, 4);
    g.printq();
    g.bfsfun(0);
    g.dfsfun(0);
    }
}
