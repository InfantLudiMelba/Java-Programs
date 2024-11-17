import java.util.*;
class find{
    List<List<Integer>>result=new ArrayList<>();
    List<Integer>subset=new ArrayList<>();
public List<List<Integer>> sol(int[] m){
    fun(m,0);
    return result;
}
public void fun(int[] m,int start){
    result.add(new ArrayList<>(subset));
    for(int i=start;i<m.length;i++){
        subset.add(m[i]);
        fun(m,i+1);
        subset.remove(subset.size()-1);
    }
}
}
public class subsetfind{
  public static  void main(String[] args){
   find f=new find();
   int[] m={8,3,4,7,9};
   int n=7;
   List<List<Integer>>newresult=new ArrayList<>();
   List<List<Integer>>result=f.sol(m);
   /*for(List<Integer>path:result){
    System.out.println(path);
   }*/
   for(List<Integer>path:result){
    int sum=0;
    for(Integer ans:path){
        sum+=ans;
    }
    if(sum==n){
        newresult.add(path);
    }
   }
   for(List<Integer> path:newresult){
    System.out.println(path);
   }
  }
}