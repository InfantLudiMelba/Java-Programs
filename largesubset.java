import java.util.*;
class large{
    List<List<Integer>>result=new ArrayList<>();
    List<Integer>sub=new ArrayList<>();
public List<List<Integer>> find(int[] m){
    backtracking(m,0);
    return result;
}
public void backtracking(int[] m,int start){
    result.add(new ArrayList<>(sub));
    for(int i=start;i<m.length;i++){
        sub.add(m[i]);
        backtracking(m,i+1);
        sub.remove(sub.size()-1);
    }
}
}
public class largesubset {
    public static void main(String[] args){
    large l=new large();
    int[] m={-2,-3,4,-1,-2,1,5,-3};
    int n=7;
    List<List<Integer>> result=l.find(m);
    /*for(List<Integer>path:result){
        System.out.println(path);
    }*/
    List<Integer>max=result.get(0);
    List<List<Integer>>newresult=new ArrayList<>();
    for(List<Integer>path:result){
        int sum=0;
        for(Integer ans:path){
            sum+=ans;
        }
        if(sum==n&&max.size()<path.size()){
            max=path;
        }
    }
    System.out.println(max);
}
}
