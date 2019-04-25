import java.util.Arrays;

public class Norma {

    public static void main(String[] args) {
        ReadInt read=new ReadInt();
        GetMatrix getMat=new GetMatrix();
        int n=read.readInt();
        int[][]mat=getMat.get(n);
        int[]sumRows=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
            sum+=Math.abs(mat[i][j]);    // write your code here
            }
            sumRows[i]=sum;
            System.out.println(sum);
        }
        Arrays.sort(sumRows);
        System.out.println("norma: "+sumRows[n-1]);
    }
}
