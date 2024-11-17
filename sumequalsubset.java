import java.util.*;
class same{
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subset(int[] m){
        List<Integer> subset=new ArrayList<>();
        backtracking(m,0,subset);
        return result;
    }
    public void backtracking(int[] m,int start,List<Integer> subset){
        result.add(new ArrayList<>(subset));
        for(int i=start;i<m.length;i++){
            subset.add(m[i]);
            backtracking(m,i+1,subset);
            subset.remove(subset.size()-1);
        }
    }
}
public class sumequalsubset {
    public static void main(String[] args){
        int[] m={1,2,3,4,5};
        List<List<Integer>> newlist=new ArrayList<>();
        int n=6;
        same s=new same();
        List<List<Integer>> result=s.subset(m);
        /*for(List<Integer> path: result){
            System.out.println(path);
        }*/
        for(List<Integer> path:result){
            int sum=0;
            for(Integer num:path){
              sum=sum+num;
            }
            if(sum==n){
                newlist.add(path);
            }
        }
        for(List<Integer>path:newlist){
            System.out.println(path);
        }
    }
}
