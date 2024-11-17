package Set10;

public class equilibriam {
    public static void main(String[] args){
        int [] n={-7,1,5,2,-4,3,0};
        int sum=0;
        int lsum=0;
        for(int i=0;i<n.length;i++){
         sum+=n[i];
        }
        for(int j=0;j<n.length;j++){
            sum-=n[j];
            if(sum==lsum){
            System.out.println("Equilibriam is:"+j);
            break;
            }
            lsum+=n[j];
        }
    }
    
}
