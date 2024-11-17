public class starsubstring {
    public static void main(String[] args){
        String s="Spoon",w="Sp*n";

       /* String s="SkSpoon",w="Sp*n"; */
int flag=0;
 for(int i=0;i<s.length();i++)
 {
  int start=i,starts=0;
  if(w.charAt(starts)==s.charAt(start)){
    while(starts<w.length()){
      if(s.charAt(start)==w.charAt(starts)){
        start++;
        starts++;
      }
      else if(w.charAt(starts)=='*'){
         if(w.charAt(starts+1)==s.charAt(start+1)){
          start++;
          starts++;
         }
         else{
          start++;
         }
      }
      else{
        break;
      }
    }
    if(w.length()==starts){
      flag=1;
      break;
    }

  }
 }
 if(flag==1){
  System.out.println("Matchs");
 }
 else{
  System.out.println("No Matchs");
 }
    }
}
