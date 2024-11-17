public class removeduplicate{
    public static void main(String []args){
         String st="aBuzZ9900";//aBuzC9012
         char s[]=st.toCharArray();
         for(int i=1;i<s.length;i++){
            for(int j=0;j<i;j++){
                if(s[i]==s[j]||s[i]==s[j]+32||s[i]==s[j]-32){
                                  if(Character.isLowerCase(s[i])){
                                    s[i]=s[i]+1;
                    //s[i]=(char)((((s[i]+1)-97)%26)+97);
                }
                else if(Character.isUpperCase(s[i])){
                    s[i]=(char)((((s[i]+1)-65)%26)+65);
                }
                else if(Character.isDigit(s[i])){
                   s[i]=(char)(((((int)s[i]+1)-48)%10)+48);
                 }
                i--;
                }
           }
         }
         System.out.println(s);

}}