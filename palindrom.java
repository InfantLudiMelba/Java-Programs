//27
public class palindrom{
    public static void main(String[] args){
        int n=363,num=n,no=0;//to find the
        String s=Integer.toString(n);
        int i=s.length()-1;
        while(n>0){
         no=no+(n%10)*(int)Math.pow(10,i);
         n/=10;
         i--;
        }
        if(num==no){
            System.out.println("Yes it is Palindrom");
        }
        else{
            System.out.println("No it is not a Palindrom");
        }
    }
}