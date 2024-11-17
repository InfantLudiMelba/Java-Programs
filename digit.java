import java.util.Scanner;
//88
public class digit {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
     System.out.println("Enter the a["+i+"]");//1 4 973 97
     a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int num=a[i];
        int count=0;
        while(num!=0){
         count+=1;
         num=num/10;
        }
        if(count==3){
            System.out.println(a[i]);
        }
    }
   } 
}
