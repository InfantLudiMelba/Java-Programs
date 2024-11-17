import java.util.Scanner;
public class passwordstrength {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String");
     String s=sc.nextLine();
     boolean low=false,high=false,num=false,spec=false;
     int no=0;
     for(int i=0;i<s.length();i++){
        if((Character.isLowerCase(s.charAt(i))) && low==false){
            low=true;
            no+=1;
        }
        if((Character.isUpperCase(s.charAt(i))) && high==false){
            high=true;
            no+=1;
        }
        if((Character.isDigit(s.charAt(i))) && num==false){
            num=true;
            no+=1;
        }
        if(!(Character.isDigit(s.charAt(i))) && !(Character.isLetter(s.charAt(i))) && spec==false){
         no+=1;
         spec=true;
        }
     }
     if(s.length()>=8){
        no+=1;
     }
     switch (no){
        case 1:
               System.out.println("Weak");
               break;
        case 2:
                System.out.println("Medium");
                break;
        case 3:
                System.out.println("Good");
                break;
        case 4:
                System.out.println("Strong");
                break;
        case 5:
                System.out.println("VeryStrong");
                break;
     }
     sc.close();
    } 
}
