 import java.util.Arrays;
 public class repeataddlastzero{
    public static void main(String[] args) {
        int a[]={0,2,2,2,0,6,6,0,8};
        for(int i=0;i<a.length;i++){
            if(a[i]!=0&&i<a.length-1){
                if(a[i]==a[i+1])
                {
                    a[i]=a[i]+a[i+1];
                    a[i+1]=0;
                }
            }
        }
        int i,pos=0;
        for( i=0;i<a.length;i++){
         if(a[i]!=0){
          System.out.print(a[i]+" ");
          }
          else{
            pos+=1;
          }
        }
        int k=0;
        while(k<pos){
         System.out.print("0 ");
         k++;
        }
    }
 }
//Output: 4 2 12 8 0 0 0 0 0 .
