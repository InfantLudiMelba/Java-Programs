import java.util.*;
class wordd{
public void find(String[] word,char fav,int len){
    boolean[] visited=new boolean[word.length];
    for(int i=0;i<word.length;i++){
        if(visited[i]==false){
        if((word[i].charAt(word[i].length()-1)=='g')&&((word[i].charAt(word[i].length()-2)=='n'))&&((word[i].charAt(word[i].length()-3))=='i')){
        
         for(int j=0;j<word.length;j++){
            if(!visited[j]&&i!=j){
                if(wlen(word[i],word[j],fav))
                {
                 System.out.println(word[i]+" "+word[j]);
                 visited[i]=true;
                 visited[j]=true;
                 break;
                }
            }
         }
        }
    }
    }
}
public boolean wlen(String w,String y,char fav){
    int co=0,c=0;
    for(int i=0;i<w.length();i++){
        if(w.charAt(i)==fav){ 
            c+=1;
        }
    }
    for(int i=0;i<y.length();i++){
        if(y.charAt(i)==fav){
            co+=1;
        }
    }
    if((w.length()+y.length()-c-co)<=10){
        return true;
    }
    else{
        return false;
    }
}
}
public class wordperline {
    public static void main(String[] args){
        int len=10;
        char fav='o';
        String[] word={"Zoho","Eating","Watching","Pogo","Loving","Mango"};
        wordd w=new wordd();
        w.find(word,fav,len);
    } 
}
