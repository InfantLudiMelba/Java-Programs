class phone{
String[] keyboard={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
public void find(String n,String ans){
    if(n.length()==0){
        System.out.println(ans);
        return;
    }
    String key=keyboard[n.charAt(0)-48];
    for(int i=0;i<key.length();i++){
     find(n.substring(1),ans+key.charAt(i));
    }

}
}
public class phonenum{
    public static void main(String[] args){
    phone p=new phone();
    String n="4234";
    p.find(n,"");
    }
}