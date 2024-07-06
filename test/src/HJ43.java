import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class HJ43 {
    public static int n;
    public static int m;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        m= in.nextInt();
        int[][] map=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                map[i][j]=in.nextInt();
            }

        }
        List<String> point=new ArrayList<>();
        search(map,0,0,point);
        point.add(0,"(0,0)");
        for(int i=0;i<point.size();i++){

            System.out.println(point.get(i));
        }


    }

    public static boolean search(int[][] map, int i,int j,List<String> point ){
        if(i==n-1&&j==m-1){
            //point.addFirst("("+i+","+j+")");
            return true;
        }
        if(i-1>=0&&map[i-1][j]==0){
            map[i][j]=1;
            if(search(map,i-1,j,point)){
                point.add(0,"("+(i-1)+","+j+")");
                return true;
            }
        }
        if(i+1<=n-1&&map[i+1][j]==0){
            map[i][j]=1;
            if(search(map,i+1,j,point)){
                point.add(0,"("+(i+1)+","+j+")");
                return true;
            }
        }
        if(j-1>=0&&map[i][j-1]==0){
            map[i][j]=1;
            if(search(map,i,j-1,point)){
                point.add(0,"("+i+","+(j-1)+")");
                return true;
            }
        }
        if(j+1<=m-1&&map[i][j+1]==0){
            map[i][j]=1;
            if(search(map,i,j+1,point)){
                point.add(0,"("+i+","+(j+1)+")");
                return true;
            }
        }

        return false;
    }

}
