import java.util.*;
class sub{
    List<List<Integer>>result=new ArrayList<>();
    List<Integer>subset=new ArrayList<>();
    public List<List<Integer>> find(int[] m){
     backtrack(m,0);
     return result;
    }
    public void backtrack(int[] m,int start){
        result.add(new ArrayList<>(subset));
        for(int i=start;i<m.length;i++){
            subset.add(m[i]);
            backtrack(m,i+1);
            subset.remove(subset.size()-1);
        }
    }
    public boolean eligible(List<Integer>path,int n){
        for(Integer ans:path){
            
            if(ans%n!=0){
                return false;
            }
        }
        return true;
    }
}
public class divisiblegroup {
    public static void main(String[] args){
    sub s=new sub();
    int[] m={3,9,7,4,6,8};
    int n=3;
    List<List<Integer>>result=s.find(m);
    List<List<Integer>>newresult=new ArrayList<>();
    for(List<Integer>path:result){
        if(path.size()>1){
        if(s.eligible(path,n)){
         newresult.add(path);
        }
        }
    }
    for(List<Integer>path:newresult){
        System.out.println(path);
    }
    }
}
