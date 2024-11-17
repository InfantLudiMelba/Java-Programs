import java.util.*;
class longclass{
List<List<Integer>>result=new ArrayList<>();
public List<List<Integer>>find(int[] m){
    Arrays.sort(m);
    List<Integer>cur=new ArrayList<>();
    for(int i=0;i<m.length;i++){
    if(cur.size()==0||m[i]==(cur.get(cur.size()-1)+1)){
        cur.add(m[i]);
    }
    else{
        result.add(new ArrayList<>(cur));
        cur.clear();
        cur.add(m[i]);
    }
    }
    result.add(cur);//for the last list
    return result;
}
}
public class alllongest {
    public static void main(String[] args){
        int[] m={1,3,9,7,8,2,4,6};
        longclass lc=new longclass();
        List<List<Integer>>result=lc.find(m);
        int max=0;
        /*for(List<Integer>path:result){
            System.out.println(path);
        }*/
        for(List<Integer>path:result){
         if(max<path.size()){
            max=path.size();
         }
        }
        for(List<Integer>path:result){
            if(max==path.size()){
                System.out.println(path);
            }
        }
    }
}
