public class maxnum{
    static int max(int num){
        int add=0,mul=1,n=num;
        while(n>0){
         add+=(n%10);
         n=n/10;
        }
        n=num;
        while(n>0){
            mul*=(n%10);
            n/=10;
        }
        if(mul>add)
         return mul;
        else
          return add;
        }
    public static void main(String[] args){
        int a[]={120,24,71,10,59};//3 8 8 1 45
        for(int i=0;i<a.length;i++){
         System.out.println(max(a[i]));
        }
    }
}