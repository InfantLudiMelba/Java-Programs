import java.util.Arrays;
public class union {
    public static void main(String[] args){
     int [] n={1,2,3,4,5,3};
     int [] k={ 1,2,7,5};
     int [] a=new int[n.length+k.length];
     System.arraycopy(n, 0, a, 0,n.length);
     System.arraycopy(k,0,a,n.length,k.length);
     System.out.println(Arrays.toString(a));
     Arrays.sort(a);
     System.out.println(Arrays.toString(a));
     for(int i=0;i<a.length;i++){
      int f=0;
        for(int j=0;j<i;j++){
         if(a[i]==a[j]){
            f=1;
            break;
         }
        }
        if(f==0){
         System.out.println(a[i]);
      }}
    }
}
