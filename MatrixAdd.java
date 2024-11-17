public class MatrixAdd {
    public static void main(String[] args){
        int a[][]={{2,4,5},{1,2},{4,9,2,1},{4,5,6,7,8}};
        int sum=0;
        for(int i=0;i<a.length;i++){
            int n=0,p=0;
            for(int j=a[i].length-1;j>=0;j--){
                n=n+a[i][j]*(int)Math.pow(10,p);
                p++;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}
