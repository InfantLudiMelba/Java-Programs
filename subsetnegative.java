import java.util.*;
class subset{
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> subset=new ArrayList<>();
    public List<List<Integer>> subsub(int[] m){
        backtracking(m,0);
        return result;
    }
    public void backtracking(int[] m,int start){
        result.add(new ArrayList<>(subset));
        for(int i=start;i<m.length;i++){
            subset.add(m[i]);
            backtracking(m,i+1);
            subset.remove(subset.size()-1);
        }
    }
    public boolean eligible(List<Integer> path){
        for(Integer n:path){
            if(n<0)
             return false;
        }
        return true;
    }
}
public class subsetnegative {
    public static void main(String[] args){
    int[] m={-2, 7, 5, -1, 3, 2, 9, -7};
    int n=14;
    subset s=new subset();
    List<List<Integer>>result=s.subsub(m);
    List<List<Integer>>newresult=new ArrayList<>();
    for(List<Integer> path:result){
        int sum=0;
        for(Integer ans:path){
            sum+=ans;
        }
        if(sum==n&&s.eligible(path)){
            newresult.add(path);
        }
    }
    List<Integer>max=new ArrayList<>();
    max=newresult.get(0);
    for(List<Integer>path:newresult){
        if(max.size()<=path.size()){
            max=path;
        }
    }
    System.out.println(max);
    }
}
