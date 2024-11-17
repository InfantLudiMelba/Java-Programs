import java.util.*;
class perm{
    List<char[]>ans=new ArrayList<>();
    public List<char[]>find(char[] s){
        backtrack(s,0);
        return ans;
    }
    public void backtrack(char[] s,int fi){
        if(fi==s.length-1){
            //System.out.println(s);
            ans.add(new char[]{s[0],s[1],s[2]}); //correct ans
            //System.out.println(ans.get(ans.size()-1));
            return;
        }
        for(int i=fi;i<s.length;i++){
            swap(s,i,fi);
            backtrack(s,fi+1);
            swap(s,i,fi);

        }
    }
    public void swap(char[] s,int i,int fi){
        char temp=s[i];
        s[i]=s[fi];
        s[fi]=temp;
        //System.out.println(s);
    }
}
public class permutation{
    public static void main(String[] args){
        String s="ABC";
        perm p=new perm();
        List<char[]>c=p.find(s.toCharArray());
        for(char[] path:c){
            System.out.println(path);
        }
    }
}