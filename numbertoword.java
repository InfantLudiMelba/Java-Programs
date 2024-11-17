public class numbertoword {
    static String numtoword(long n){
         String ans="";
         if(n==0)
           return "zero";
         else{
            String mul[]={"","Trillion","Billion","Million","Thousand"};
            String fd[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
            String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            if(n<20){
                return fd[(int)n];
            }
            long cur_hun,t=0,limit=1000000000000L;
            for(long i=n;i>0;i=i%limit,limit=limit/1000){
             cur_hun=i/limit;
             while(cur_hun==0){
                i%=limit;
                limit/=1000;
                cur_hun=i/limit;
                t++;
             }
             System.out.println("T is"+t);
             if(cur_hun>99)
               ans+=(fd[(int)cur_hun/100]+" Hundred ");
            cur_hun%=100;
            if(cur_hun>0&&cur_hun<20)
               ans+=(fd[(int)cur_hun]+" ");
            else if(cur_hun%10==0 && cur_hun<100)
               ans+=(tens[(int)cur_hun/10]+" ");
            else if(cur_hun>20&&cur_hun<100)
               ans+=(tens[(int)cur_hun/10]+" "+fd[(int)cur_hun%10]+" ");
            if(t<4)
               ans+=(mul[(int)++t]+" ");
            }
        }  
     return ans; 
    }
    public static void main(String[] args){
      long n=1000;
        //long n=1200403400000L;
        String s=numtoword(n);
        System.out.println(s);
    }
}
