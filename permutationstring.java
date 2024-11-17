import java.util.*;
import java.lang.*;
class permutation{
    public void per(char[] a,int fi)//fi is fixed index
    {
        if(fi==a.length-1){
            System.out.print(a);
            System.out.println();
            return;
        }
     for(int i=fi;i<a.length;i++){
        swap(a,fi,i);
        per(a,fi+1);
        swap(a,fi,i);
     }
    }
    public void swap(char[] a,int n,int m){
        char temp=a[n];
        a[n]=a[m];
        a[m]=temp;

    }
}
public class permutationstring {
    public static void main(String[] args){
        permutation p=new permutation();
        String a="ABC";
        p.per(a.toCharArray(),0);
    }
}
