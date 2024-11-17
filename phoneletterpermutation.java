class phone{
String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
public void fun(String s,String ans){
 if(s.length()==0){
   System.out.println(ans);
   return;
 }
 String key=keypad[s.charAt(0)-48];
 for(int i=0;i<key.length();i++){
    fun(s.substring(1),ans+key.charAt(i));
 }
}
}
public class phoneletterpermutation {
    public static void main(String[] args){
    phone p=new phone();
    p.fun("846","");
    }
}
