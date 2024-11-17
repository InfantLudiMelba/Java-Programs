public class EO{
    public static void main(String[] args){
        int n[]={1,2,3,4,5,6,7};
        int o=0,e=0;
        for(int i=0;i<n.length;i++){
        if(n[i]%2==0)
        e+=1;
        else 
        o+=1;
        }
        System.out.println("ODD:"+o+"\nEven:"+e);
        }
    }