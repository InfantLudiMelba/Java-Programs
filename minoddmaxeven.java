import java.util.Arrays;
public class minoddmaxeven{
public static void main(String[] args){
    int a[]={5,8,11,6,2,1,7};
    int small,large,even=0,odd=0;
    for(int i=0;i<a.length;i++){
       if(a[i]%2==1){
        odd++;
       }
    }
    even=a.length-odd;
    for(int i=0;i<odd;i++){
        small=Integer.MAX_VALUE;
        for(int j=i;j<a.length;j++){
            if(a[j]%2==1){
                if(small>a[j]){
                    small=a[j];
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    
                }
            }
        }
    }
    System.out.println(Arrays.toString(a));
    for(int i=odd;i<a.length;i++){
        large=Integer.MIN_VALUE;
        for(int j=i;j<a.length;j++){
           if(a[j]%2==0){
             if(large<a[j]){ 
                large=a[j];
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                
            }
           }
        }
    }
System.out.println(Arrays.toString(a));
}
}