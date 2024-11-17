import java.util.*;
class sub{
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> subset=new ArrayList<>();
    public List<List<Integer>> find(int[] m){
    backtrack(m,0,subset,result);
    return result;
    }
    public void backtrack(int[] m,int start,List<Integer> subset,List<List<Integer>> result){
        result.add(new ArrayList<>(subset));
     for(int i=start;i<m.length;i++){
        subset.add(m[i]);
        backtrack(m,i+1,subset,result);
        subset.remove(subset.size()-1);
     }
    }
}
public class sumofsubset {
    public static void main(String[] args){
    int[] m={2,3,5,8,10};
    int n=10;
    sub s=new sub();
    List<List<Integer>> newresult=new ArrayList<>();
    List<List<Integer>> result=s.find(m);
    for(List<Integer> ans:result){
        int sum=0;
        for(Integer num:ans){
         sum+=num;
        }
        if(sum==n){
         newresult.add(ans);
        }
    }
    for(List<Integer>ans:newresult){
        System.out.println(ans);
    }
    }
}
