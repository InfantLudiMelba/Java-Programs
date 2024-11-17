import java.util.*;
class binaryy{
public void find(String s,String ans){
    if(s.length()==0){
        System.out.println(ans);
        return;
    }
    //pick as it as
    find(s.substring(1),ans+"0");
    find(s.substring(1),ans+"1");

}
}
public class binarynumber {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length");
    int n=sc.nextInt();
    String s="";
    for(int i=0;i<n;i++){
     s=s+"0";
    }
    binaryy b=new binaryy();
    b.find(s,"");
  }  
} 
