import java.util.Scanner;
public class firstNprime {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N");
    int n=sc.nextInt();
    int x=2;
    for(int i=1;i<=n;){
       int count=0;
        for(int j=1;j<=x;j++){
            if(x%j==0)
            count++;
        }
        if(count==2){
            System.out.println(x);
            i++;
        }
        x++;
    }
    }
}
