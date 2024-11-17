class degreeclass{
    public double sinv(double degree,int base){
        double ratian=Math.toRadians(degree);
        double sin=0;
        for(int i=0;i<base;i++){
        int sign=(i%2==0)?1:-1;
        double term=sign*(Math.pow(ratian,(i*2)+1)/factorial(2*i+1));
        sin+=term;
        }
        return sin;
    }
    public long factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        else{
            long result=1;
            for(int i=2;i<=num;i++){
             result=result*i;
            }
            return result;
        }
    }
}
public class rough {
    public static void main(String[] args){
        double degree=30;
        int base=10;
        degreeclass d=new degreeclass();
        double ans=d.sinv(degree,base);
        System.out.println(ans);
        char c=(char)3+48;
        int n=(int)c-48;
        System.out.println(c);
        System.out.println(n);
    }}
