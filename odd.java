import java.util.Scanner;
public class odd{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        if(a%2==0)
          a+=1;
        for(int i=a;i<b;i+=2){
            System.out.println(i);
        }
    }
}