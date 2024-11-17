public class distanceletter {
    public static void main(String[] args){
       // String s="abcccccbba";
        String s="aaaaaaaa";
        int len=0;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=0;j--){
                if(s.charAt(i)==s.charAt(j)){
                 if(j-i-1>len){
                    len=j-i-1;
                    break;
                 }
                }
            }
        }
        System.out.println(len);
    }
}
