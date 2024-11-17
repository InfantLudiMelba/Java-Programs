public class pixel { 
    public static void main(String[] args){
        int m[][]={{1, 1, 1, 1, 1, 1, 1, 1},

        {1, 1, 1, 1, 1, 1, 0, 0},

        {1, 0, 0, 1, 1, 0, 1, 1},

        {1, 2, 2, 2, 2, 0, 1, 0},

        {1, 1, 1, 2, 2, 0, 1, 0},

        {1, 1, 1, 2, 2, 2, 2, 0},

        {1, 1, 1, 1, 1, 2, 1, 1},

        {1, 1, 1, 1, 1, 2, 2, 1},

        };
    int n=3,x=4,y=4;
    int o=m[x][y];
    for(int i=0;i<m.length;i++){
        for(int j=0;j<m[0].length;j++){
            if(m[i][j]==o){
                m[i][j]=n;}
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
    }

    }
}
