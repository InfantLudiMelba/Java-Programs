class sub{
public void gss(String s,String ans){
 if(s.length()==0){
    System.out.println(ans);
    return;
 }
 //pick
 gss(s.substring(1),ans+s.charAt(0));
 //not pick
 gss(s.substring(1),ans);
}}

public class subsequence {
    public static void main(String[] args){
    String s="abc";
    sub ss=new sub();
    ss.gss(s," ");
    }
}
