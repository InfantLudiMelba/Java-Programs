import java.util.Arrays;
public class matrix {
    static int no(int[] a){
        int n=a[a.length-1];
        for(int i=1;i<a.length-1;i++){
        n=n+a[a.length-1-i]*(int)Math.pow(10,i);
        }
        return n;
    }
    public static void main(String[] args){
        int[][] a={{1,0,1},{1,1,0},{1,0,1},{1,1,1}};
        int num;
        for(int i=0;i<a.length;i++){
            int f=0;
            num=no(a[i]);
           for(int j=0;j<i;j++){
               int k=no(a[j]);
               if(num==k){
                f=1;
               }
           }
           if(f!=1){
            System.out.println(Arrays.toString(a[i]));
           }
        }
    }
}
