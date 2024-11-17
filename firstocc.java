import java.util.Scanner;
public class firstocc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String s="ZOHOCORPORATION PORT";
        System.out.println("Enter the second string");
        String e="OHOCORPORAT";
        int start=0,end=0,j=0,len=0;
    for(int i=0;i<s.length();i++){
        for(j=0;j<e.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                if(start==0){
                    start=i;
                }
                len+=1;
                if(len==e.length()){
                    end=j;
                }
        }
            else 
            {   len=0;
                start=0;
                break;
            }
            }
        }
        for(int i=start;i<=end;i++){
         System.out.print(e.charAt(i));
        }
        sc.close();
    }



    }
