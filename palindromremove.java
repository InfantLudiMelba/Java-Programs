public class palindromremove {
    static void rev(String s,int start,int end){
        int a=start,b=end,count=0;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                if(start==end)
                count++;
                else
                count+=2;
            }
            start++;
            end--;
        }
        if(count!=b-a+1)//notable to add +1
        {
            while(a<=b){
                System.out.print(s.charAt(a));
                a++;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        String s="He did a good deed mokka";
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)==' '){
            end=i-1;
            rev(s,start,end);
            start=end+2;
         }
        }
        rev(s,end+2,s.length()-1);
    }
    
}
