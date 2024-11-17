class decode{
    public void fun(char[] digit){
        int[] count=new int[digit.length+1];
        count[0]=1;
        count[1]=1;
        for(int i=2;i<=digit.length;i++){
            count[i]=0;
            if(digit[i-1]>'0'){
                count[i]=count[i-1];
            }
            if(digit[i-2]=='1'||(digit[i-2]=='2'&&(digit[i-1]<'7'))){
                count[i]+=count[i-2];
            }
        }
        System.out.println(count[digit.length]);
    }
}
public class counddecode {
    public static void main(String[] args){
        String s="11243";
        decode dc=new decode();
        dc.fun(s.toCharArray());
    }
}
