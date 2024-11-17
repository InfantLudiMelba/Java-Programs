import java.util.*;
class sinfind{
    public double sinv(double degree,int base){
        double radian=Math.toRadians(degree);
        double sine=0;
        for(int i=0;i<base;i++){
            int sign=(i%2==0)?1:-1;
            double term=sign*((Math.pow(radian,2*i+1))/fact(2*i+1));
            sine+=term;
        }
        return sine;
    }
    public long fact(int num){
        if(num==0||num==1){
            return 1;
        }
        else{
            long ans=1;
            for(int i=2;i<=num;i++){
             ans+=i;
            }
            return ans;
        }
    }
}
public class sinvalue {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the degree");
    double degree=sc.nextDouble();
    System.out.println("Enter the base");
    int base=sc.nextInt();
    sinfind sf=new sinfind();
    double sine=sf.sinv(degree,base);
    System.out.println(sine);
    }
}
