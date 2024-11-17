//87
public class dup {
    public static void main(String[] args){
        int[] n={1,1,2,4};
        for(int i=0;i<n.length;i++){
            int f=0;
            for(int j=0;j<i;j++){
                if(n[i]==n[j]){
                    f=1;
                    break;
                }
            }
            if(f==0)
            System.out.println(n[i]);
        }
    }
}
