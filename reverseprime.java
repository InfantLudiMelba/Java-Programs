public class reverseprime{
    static int prime(int n){
        int count=1;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
             count++;
        }
        if(count==2)
          return 1;
        else
          return 0;
    }
    static int rev(int n){
        String s=Integer.toString(n);
        System.out.println("Number"+n);
        int len=s.length()-1,num=0;
        while(n>0&&len>=0){
         num=num+(n%10)*(int)Math.pow(10,len);
         n/=10;//important
         len--;//important
        }
        System.out.println("Reversed"+num);
     return num;
    }
    public static void main(String[] args){
        int n=97,f=0;
        f+=prime(n);
        n=rev(n);
        f+=prime(n);
        if(f==2){
            System.out.println("Yes it is Reversible prime");
        }
        else{
            System.out.println("It is not an Reversible prime");
        }
    }
}