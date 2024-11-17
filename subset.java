import java.util.*;
class sub{
    List<List<Integer>>result=new ArrayList<>();
    List<Integer>subs=new ArrayList<>();
    public List<List<Integer>> find(int[] m){
        backtrack(m,0);
        return result;
    }
    public void backtrack(int[]m,int start){
        result.add(new ArrayList<>(subs));
        for(int i=start;i<m.length;i++){
            subs.add(m[i]);
            backtrack(m,i+1);
            subs.remove(subs.size()-1);
        }
    }
}
public class subset {
    public static void main(String[] args){
     sub s=new sub();
     int[] m={1, 2, 4, 3, 5, 6};
     int n=5;
     List<List<Integer>> result=s.find(m);
     List<List<Integer>>newresult=new ArrayList<>();
     for(List<Integer>path:result){
        int sum=0;
       for(Integer ans:path){
       sum+=ans;
       }
       if(sum==n){
        newresult.add(path);
       }
     }
     for(List<Integer>path:newresult){
     System.out.println(path);}
    }
}
