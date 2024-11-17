import java.util.Arrays;
public class frequency {
    static int occ(int[] a,int n){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==n)
             c++;
        }
        return c;
    }
    public static void main(String[] args){
        int a[]={0,-1,2,1,0};
        //int a[]={2,2,3,4,5,12,2,3,3,3,12};
        for(int i=0;i<a.length;i++){
            int oc=occ(a,a[i]);
            for(int j=i+1;j<a.length;j++){
                if(occ(a,a[j])>oc){
                    oc=occ(a,a[j]);
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                if(occ(a,a[j])==1&&oc==1){//important thing
                    if(a[j]<a[i]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
     System.out.println(Arrays.toString(a));
    }
}
