class Sort{
    public void merge(int[] a,int lb,int ub){
    int mid=(lb+ub)/2;
    if(lb<ub){
    merge(a,lb,mid);
    merge(a,mid+1,ub);
    merges(a,lb,mid,ub);
    }
    if(lb==0&&ub==9){
        for(int i=0;i<10;i++){
            System.out.print(a[i]+"\t");
        }
    }
    }
    public void merges(int[] a,int lb,int mid,int ub){
     int n1=mid-lb+1;
     int n2=ub-mid;
     int[] a1=new int[n1];
     int[] a2=new int[n2];
     for(int i=0;i<n1;i++){
        a1[i]=a[lb+i];
     }
     for(int j=0;j<n2;j++){
        a2[j]=a[mid+1+j];
     }
     int i=0,j=0,k=lb;
     while(i<n1&&j<n2){
     if(a1[i]<=a2[j]){
        a[k]=a1[i];
        i++;
     }
     else{
        a[k]=a2[j];
        j++;
     }
     k++;
     }
     while(i<n1){
        a[k]=a1[i];
        i++;
        k++;
     }
     while(j<n2){
        a[k]=a2[j];
        j++;
        k++;
     }
    }

}
public class mergesort{
    public static void main(String[] args){
        Sort s=new Sort();
        int[] a={9,8,7,6,5,4,3,2,1,0};
        s.merge(a,0,9);
    }
}