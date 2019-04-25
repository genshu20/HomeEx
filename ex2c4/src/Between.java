public class Between {

    public static void main(String[] args) {
        ReadInt read=new ReadInt();
        GetMatrix getMat=new GetMatrix();
        int n=read.readInt();
        int[][]mat=getMat.get(n);
        for(int i=0;i<n;i++){
            boolean b=false;
            boolean d=false;
            int sum=0;
            int x=0;
            int y=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]>=0&&j<n-2&&!b) {
                    b=true;
                    x = j;
                }
                if(mat[i][j]>=0&&b&&!d&&j>x){
                    d=true;
                  y=j;
                }
                    }
            if(y!=0&&y>x+1){
                for(int m=x+1;m<y;m++){
                    sum=sum+mat[i][m];
                }
                System.out.println("row "+i+" sum "+sum);
            }
                }
            }
        }


