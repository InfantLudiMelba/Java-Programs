import java.util.Arrays;
public class consectiveone {
    static int[] increse(int[] b){
        int[] temp=new int[b.length+1];
        for(int i=0;i<b.length;i++){
            temp[i]=b[i];
        }
        b=temp;
      return b;
    }
    static int[] add(int[] b,int i,int k){
        int j;
        for( j=b.length-1;j>i;j--){
            int temp=b[j];
            b[j]=b[j-1];
            b[j-1]=temp;
        }
        b[j]=0;
     return b;
    }
    public static void main(String[]  args){
        int n=12,k=2,j,i;
        int b[]={1,0,1,1,0,1,1,0,1,1,1,1};//1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
        for(i=0;i<b.length;i++){
            for(j=i;j<i+k&&i<b.length-1;j++){
                if(b[j]!=1){
                    break;
                }
            }
            //System.out.println("i value:"+i+"j value:"+j);
            if(j-i==k){
             b=increse(b);
             b=add(b,j,k);
             System.out.println(Arrays.toString(b));
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
