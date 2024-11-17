public class greaterofthree{
    public static void main(String[] args){
        int a=10,b=12,c=34;
        if(a>b&&a>c){
           System.out.println("a is greater:"+a);
        }
        else if(b>c){
            System.out.println("b is greater:"+b);
        }
        else{
            System.out.println("c is greater:"+c);
        }
    }
}