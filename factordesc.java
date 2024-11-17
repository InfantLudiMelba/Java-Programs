import java.util.Arrays;
public class factordesc {
    static int count(int a){
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
             c++;
            }
        }
     return c;
    }
    public static void main(String[] args){
        int a[]={8,2,3,12,16};
        int co;
        for(int i=0;i<a.length;i++){
           co=count(a[i]);
           System.out.println(count(co));
            for(int j=i+1;j<a.length;j++){
                if(count(a[j])>co)
                  {
                    co=count(a[j]);
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                  }

            }
        }

       System.out.println(Arrays.toString(a));
    }
}
