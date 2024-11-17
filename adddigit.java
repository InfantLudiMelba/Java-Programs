public class adddigit {
    public static void main(String[] args){
        int n=4,s=2875;//o/p= 612119
        int ne=0,i=0;
        while(s!=0){
            int rem=s%10;
            if(ne>10*i){
                i++;
            }
          ne=ne+((rem)+n)*(int)Math.pow(10,i);
          i++;
          s=s/10;
        }
        System.out.println(ne);
    }
}
