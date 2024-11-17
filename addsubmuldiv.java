import java.util.Scanner;
public class addsubmuldiv {
    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a+(-(b));
    }
    static int mul(int a,int b){
        int m=0;
        int aa=0,bb=0;
        if(a<0){
            aa=-(a);
        }
        if(b<0){
            bb=-(b);
        }
        else if(a>0){
        aa=a;
        }
        else if(b>0){
            bb=b;
        }
        for(int i=0;i<bb;i++){
           m+=aa;
        }
        if(!((a<0&&b<0)||a>0&&b>0)){
            m=-m;
        }
        return m;
    }
    static int div(int a,int b){
        int d=0,count=-1;
        while(d<=a){
            d+=b;
            count+=1;
        }
         return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a");
        int a=sc.nextInt();
        System.out.println("Enter the b");
        int b=sc.nextInt();
        System.out.println("Addition:"+add(a,b));
        System.out.println("Subraction:"+sub(a,b));
        System.out.println("Multiplication:"+mul(a,b));
        System.out.println("Division:"+div(a,b));
    }
    
}
