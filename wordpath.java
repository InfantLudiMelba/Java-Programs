import java.util.*;
class rou{
    int drow[]={0,1};
    int dcol[]={1,0};
    List<String> result=new ArrayList<>();
     Queue<List<int[]>> queue=new LinkedList<>();
    public List<String> sol(char[][] m,String[] Dictionary){
    for(int i=0;i<Dictionary.length;i++){
        for(int j=0;j<m.length;j++){
            for(int k=0;k<m[0].length;k++){
                if(Dictionary[i].charAt(0)==m[j][k]){
                    List<int[]> initial=new ArrayList<>();
                    initial.add(new int[]{j,k});
                    queue.offer(initial);
                    solve(m,Dictionary[i]);
                }
            }
        }
    }
    return result;
    }
    public void solve(char[][] m,String word){
        int i=0;
        while(queue.size()!=0){
            List<int[]> curpath=new ArrayList<>();
            curpath=queue.poll();
            int[] curpos=curpath.get(curpath.size()-1);
            if(m[curpos[0]][curpos[1]]==word.charAt(i)){
                i++;
            }
            if(i==word.length()){
                result.add(word);
                return;
            }
            for(int j=0;j<2;j++){
             int nextrow=curpos[0]+drow[j];
             int nextcol=curpos[1]+dcol[j];
             if(nextcol<0||nextrow<0||nextrow>=m.length||nextcol>=m[0].length){
                continue;
             }
             if(m[nextrow][nextcol]!=word.charAt(i)){
                continue;
             }
             if(visited(curpath,nextrow,nextcol)){
                continue;
             }
             List<int[]>newpath=new ArrayList<>(curpath);
             newpath.add(new int[]{nextrow,nextcol});
             queue.offer(newpath);
            }
        }
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
public class wordpath{
    public static void main(String[] args){
        
        char [][] m={{'a','z','o','l'},{'n','x','h','o'},{'v','y','i','v'},{'o','r','s','e'}}; 
        String[] Dictionary = {"van","zoho","love","are","is"};
        rou r=new rou();
        List<String>result=r.sol(m,Dictionary);
        
        for(String cell:result){
         System.out.println(cell);
        }

         /*Output: 
        
            zoho 
        
            love 
        
            Is */
        
    }
}