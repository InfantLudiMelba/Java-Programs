package Set10;
import java.util.Scanner;
import java.util.Arrays;
public class Adjacent {
    public void mat(int[][] m,int c,int r){
        int[][] n=new int[c][r];
        for(int k=0;k<r;k++){
            for(int o=0;o<c;o++){
                n[k][o]=m[k][o];
            }
        }
        System.out.println(Arrays.deepToString(n));
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==1){
                    if(j<c-1){
                    n[i][j+1]=0;
                    }
                    if(i<r-1){
                    n[i+1][j]=0;}
                    if(i>=1){
                        n[i-1][j]=0;
                    }
                    if(j>=1){
                        n[i][j-1]=0;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(n));

    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row");
      int r=sc.nextInt();
      System.out.println("Enter the column");
      int c=sc.nextInt();
      int[][] m=new int[r][c];
      System.out.println("Enter the array");
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.println("Enter the no m["+i+"]["+j+"]");
            m[i][j]=sc.nextInt();
        }
      }
      System.out.println(Arrays.deepToString(m));
      Adjacent a=new Adjacent();
      a.mat(m,c,r);
    }
}
