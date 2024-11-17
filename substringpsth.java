import java.util.*;
class substring{
    int[] dr={0,1};
    int[] dc={1,0};
    Queue<List<int[]>>queue=new LinkedList<>();
    public void subsol(char[][]m,String sub,int row,int col){
       // System.out.println("hi");
        List<int[]>init=new ArrayList<>();
        init.add(new int[]{row,col});
        queue.offer(init);
        subsolve(m,sub);
    }
    public void subsolve(char[][] m,String sub){
    int i=0;
    //System.out.println("hi");
    while(queue.size()!=0){
        List<int[]>curpath=new ArrayList<>();
        curpath=queue.poll();
        int[] curpos=curpath.get(curpath.size()-1);
        if(i<sub.length()-1&&(m[curpos[0]][curpos[1]]==sub.charAt(i)||m[curpos[0]][curpos[1]]==((sub.charAt(i))+32)||m[curpos[0]][curpos[1]]==((sub.charAt(i))-32))){
            i++;
         }
        for(int j=0;j<2;j++){
         int nextr=curpos[0]+dr[j];
         int nextc=curpos[1]+dc[j];
         if(nextr<0||nextc<0||nextr>=m.length||nextc>=m[0].length){
            continue;
         }
         if(visited(curpath,nextr,nextc)){
            continue;
         }
         if(m[nextr][nextc]!=sub.charAt(i)&&m[nextr][nextc]!=((sub.charAt(i))+32)&&m[nextr][nextc]!=((sub.charAt(i))-32)){
            continue;
         }
         if(i==(sub.length())-1){
            System.out.println("Row:"+nextr+"col:"+nextc);
            return;
            }
         List<int[]>newpath=new ArrayList<>();
         newpath.add(new int[]{nextr,nextc});
         queue.offer(newpath);
        }
    }
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
public class substringpsth {
    public static void main(String[] args){
        String word="WELCOMETOZOHOCORPORATION";
        char[][] m=new char[5][5];
        String sub="too";
        int k=0;
        for(int i=0;i<5&&k<word.length();i++){
            for(int j=0;j<5&&k<word.length();j++){
            m[i][j]=word.charAt(k);
            k++;
            }
        }
        substring s=new substring();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(sub.charAt(0)==m[i][j]||(sub.charAt(0)+32)==m[i][j]||(sub.charAt(0)-32)==m[i][j]){
                    //System.out.println("hi");
                    s.subsol(m,sub,i,j);
                    //System.out.println("i and j is:"+i+j);
                }
            }
        }
       /*for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(m[i][j]);
            }
        System.out.println();} 
WELCO
METOZ
OHOCO
RPORA
TION*/ 
    }
}
