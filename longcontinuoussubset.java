import java.util.*;
class longsubset{
    public List<Integer> find(int[] m){
        List<Integer>current=new ArrayList<>();
        List<Integer>longest=new ArrayList<>();
        Arrays.sort(m);
        for(int i=0;i<m.length;i++){
         if(current.size()==0||m[i]==current.get((current.size()-1))+1){
            current.add(m[i]);
         }
         else{
            if(current.size()>longest.size()){
                longest=new ArrayList<>(current);
            }
            current.clear();
            current.add(m[i]);
         }
        }
        if(current.size()>longest.size()){
            longest=current;
        }
    return longest;
    }
}
public class longcontinuoussubset{
    public static void main(String[] args){
        int m[]={ 1,3,9,7,8,2,4,6};
        longsubset ls=new longsubset();
        List<Integer> ans=ls.find(m);
        System.out.println(ans);
    }
}