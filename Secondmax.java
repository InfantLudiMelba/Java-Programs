import java.util.Arrays;
public class Secondmax{
public static void main(String[] args){
 //int n[]={2,5,1,6,2,6,7,10};
 int n[]={1};
 if(n.length<2){
    System.out.println("NO second Array");
 }
 else{
 Arrays.sort(n);
 System.out.println(n[n.length-2]);
 }
}}