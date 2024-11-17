public class alpharepeat{
  public static void main(String[] args){
  System.out.println("Enter the Sring");
  String s="a1b10";
  int num=0;
  for(int i=0;i<s.length();i++){
    if(Character.isLetter(s.charAt(i))){
      num=s.charAt(i+1)- '0';//important to note converting char to int
      if(Character.isDigit(s.charAt(i+2))){
      num=num*10+s.charAt(i+2)- '0';
      }
       for(int j=0;j<num;j++){
        System.out.print(s.charAt(i));
       }
    }
  }
  }  
}