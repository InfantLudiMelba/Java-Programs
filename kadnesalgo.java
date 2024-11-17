
public class kadnesalgo {
    public static void main(String[] args){
    int[] m={-2,-3,4,-1,-2,1,5,-3 };
    int maxsofar=Integer.MIN_VALUE;
    int maxend=0;
    int start=0,s=0,end=0;
    for(int i=0;i<m.length;i++){
    maxend+=m[i];
    if(maxsofar<maxend){
        maxsofar=maxend;
        start=s;
        end=i;
    }
    if(maxend<0){
        maxend=0;
        s=i+1;
    }
    }
    System.out.println(maxsofar);
    System.out.println("Start:"+start);
    System.out.println("End:"+end);
    }
}
