public class sumeitherside {
    public static void main(String[] args){
        int a[]={1, 2,10,3, 7, 6};
        int sum=0,sub=0;
        for(int i=0;i<a.length;i++){
          sum+=a[i];
        }
        for(int j=0;j<a.length;j++){
            sum-=a[j];
         if(sub==sum){
            System.out.println(a[j]);
         }
         sub+=a[j];
         
        
        }
    }
}
