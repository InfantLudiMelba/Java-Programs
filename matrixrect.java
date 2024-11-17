public class matrixrect{
    public static void main(String[] args){
        int[][] m={{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
        //int[][] m={{1,2},{2,3},{3,4}};
        int i=2,j=0,k=3,z=4,sum=0;
        if(m.length<=m[0].length){
            for(int x=i;x<=k&&x<m.length;x++){
                for(int y=j;y<=z&&y<m[0].length;y++){
                    System.out.print(m[x][y]);
                    sum+=m[x][y];
                }
                System.out.println();
            }
        }
        else{
            for(int x=j;x<=z&&x<m[0].length;x++){
                for(int y=i;y<=k&&y<m.length;y++){
                    System.out.print(m[y][x]);
                    sum+=m[y][x];
                }System.out.println();
            }
        }
        System.out.println(sum);
    }
}