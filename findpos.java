public class findpos {
    public static void main(String[] args){
        int x=4,y=5,n=9;
        char s[]={'U','L','R','R','D','D','U','L','R'};
        for(int i=0;i<s.length;i++){
            switch(s[i]){
             case 'U':
                y++;
                break;
             case 'D':
                y--;
                break;
             case 'L':
                x--;
                break;
             case 'R':
                x++;
                break;
            }
        }
        System.out.println("Position is:"+x+","+y);
    }
}
