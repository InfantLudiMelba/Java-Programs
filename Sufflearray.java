import java.util.Scanner;
import java.util.Arrays;
import java.util.List;//note note
import java.util.Collections;//note
public class Sufflearray {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the Start");
    int n=sc.nextInt();
    System.out.println("Enter the end");
    int m=sc.nextInt();
    Integer a[]=new Integer[m-n+1];
    a[0]=n;
    for(int i=1;i<a.length;i++){
      a[i]=a[i-1]+1;
    }
    System.out.println(Arrays.toString(a));  
    List <Integer> nlist=Arrays.asList(a);//Notable also 5, 7, 2, 1, 6, 4, 3
    Collections.shuffle(nlist);//Note here
    nlist.toArray(a);
    System.out.println(Arrays.toString(a));   
}}
