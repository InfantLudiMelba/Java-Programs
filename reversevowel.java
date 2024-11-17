public class reversevowel {
    static void rev(char[] s){
     int i=0,j=s.length-1;
     while(i<j){
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
            while(s[j]!='a'&&s[j]!='e'&&s[j]!='i'&&s[j]!='o'&&s[j]!='u'){
            j--;
            }
            if(s[j]=='a'||s[j]=='e'||s[j]=='i'||s[j]=='o'||s[j]=='u'){
            char temp;
            temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            j--;
            }
        }
        i++;
     }
     System.out.println(s);
    }
    public static void main(String[] args){
        String s="abcdef";
        rev(s.toCharArray());
    }
    
}
