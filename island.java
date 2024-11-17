public  class island{
    public static void main(String[] args){
        int count=0;
        int[][] m={{1,-1,-1,1},{-1,1,-1,1},{-1,-1,1,-1},{-1,-1,-1,1}};
        for(int i=0;i<m.length;i++){
            boolean yes=false;
            for(int j=0;j<m[0].length;j++){
            if(m[i][j]==1){
                //System.out.println("I &jvalue is:"+i+" "+j);
             if((i-1)>=0&&(i+1)<m.length&&(j-1)>=0&&(j+1)<m[0].length){
                if((m[i-1][j]==-1)&&(m[i+1][j]==-1)&&(m[i][j-1]==-1)&&(m[i][j+1]==-1)){
                yes=true; 
                count++;
                }
             }
            }
             if(yes){
                System.out.println("i value and j value are: "+i+" "+j);
                yes=false;
             }
            }
        }
        System.out.println("Count is:"+count);
    }
}