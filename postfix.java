class posttfix{
public void po(String s){

}
}
public class postfix {
    public static void main(String[] args){
        String s="(a+b)*(a+b)";
        posttfix p=new posttfix(s);
        p.po(s);
    }
}
