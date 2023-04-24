public class TwoArrayExample {
    public static void main(String args[]){
        int[][]twoDMatrix=new int[3][4];
 
        twoDMatrix[0][0]=1;
        twoDMatrix[0][1]=2;
        twoDMatrix[0][2]=3;
        twoDMatrix[0][3]=4;

        twoDMatrix[1][0]=5;
        twoDMatrix[1][1]=6;
        twoDMatrix[1][2]=7;
        twoDMatrix[1][3]=8;

        twoDMatrix[2][0]=9;
        twoDMatrix[2][1]=10;
        twoDMatrix[2][2]=7;
        twoDMatrix[2][3]=8;

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
            System.out.println(twoDMatrix[i][j]+"");
        }
        System.out.println();

    }
    
}
