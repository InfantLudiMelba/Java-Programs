public class extra{
    static void fun(int[] n,int[] m){
        for(int i=0;i<n.length;i++){
            int f=0;
            for(int j=0;j<m.length;j++){
                if(n[i]==m[j]){
                f=1;
                break;}
            }
            if(f==0){
                System.out.println(n[i]+" it is extra on index"+i);
            }
        }
    }
    public static void main(String[] args){
       int n[]={-1, 0, 3, 2},m[]={3, 4, 0, -1, 2};
        //int n[]={10,20,30,12,5},m[]={10, 5, 30, 20};
        if(n.length>m.length)
        fun(n,m);
        else if(n.length==m.length)
        System.out.println("No Extra");
        else
        fun(m,n);
    }
}