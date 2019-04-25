public class Transpon {

    public static void main(String[] args) {
        ReadInt read=new ReadInt();
        GetMatrix getMat=new GetMatrix();
        int n=read.readInt();
        int[][]mat=getMat.get(n);
        int[][]transponir=new int[n][n];
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transponir[i][j]=mat[j][i];
                System.out.printf("%4d",transponir[i][j]);// write your code here
            }
            System.out.println();
        }
    }
}
