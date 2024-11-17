import java.util.*;
import java.lang.*;
public class roughone{
    public static void main(String[] args){
        String s="abc def ghijk lmnopQ rstuvwxyz";
        int[] a=new int[26];
        for(int i=0;i<26;i++){
            a[i]=0;
        }
        int flag=1;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)>=65&&s.charAt(i)<91){
          a[(s.charAt(i))%65]=1; 
         }
         else if(s.charAt(i)>=97&&s.charAt(i)<123){
            a[(s.charAt(i))%97]=1;
         }
        }
        for(int i=0;i<26;i++){
         if(a[i]==0){
            flag=0;
            System.out.println("It is not a panagram");
         }
        }
        if(flag==1){
            System.out.println("It is a panagram");
        }
    }
}