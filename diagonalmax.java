public class diagonalmax {      
    static int comp(int sum,int temp){
        if (temp>sum)
          sum=temp;
    return sum;
    }  
    public static void main(String[] args)
    {

    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int temp=0,sum=0;
    for(int i=0;i<=2;i++){
        for(int j=i;j>=0;j--){
          temp+=a[i][j];
        }
    }
    System.out.println("Temp:"+temp);
    sum=comp(sum,temp);
    temp=0;
    for(int i=2;i>=0;i--){
        for(int j=i;j<=2;j++){
            temp+=a[i][j];
        }
    }
    System.out.println("Temp:"+temp);
    sum=comp(sum,temp);
    temp=0;
    for(int i=2;i>=0;i--){
        for(int j=2-i;j>=0;j--){
            temp+=a[i][j];
        }
    }
    System.out.println("Temp:"+temp);
    sum=comp(sum,temp);
    temp=0;
    for(int i=2;i>=0;i--){
        for(int j=2-i;j<=2;j++){
            temp+=a[i][j];
        }
    }
    System.out.println("Temp:"+temp);
    sum=comp(sum,temp);
    System.out.println("Answer"+sum);
    }
}