public class window {
    public static void main(String[] args){
        int[] m={1,3,5,2,1,8,6,9};
        int n=3,max=0;
        for(int i=0;i<m.length;i++){
            if(m[i]>n&&m[i]>=max){
                max=m[i];
            }
            if(max<n){
                
            }
            else {
                System.out.println(max);
            }
        }
    }
}
