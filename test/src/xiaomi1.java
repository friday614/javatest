import java.util.*;

/**
 * @author 周诚信
 * @date 2024/3/12
 */
public class xiaomi1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        in.nextLine();
        String love=in.nextLine();
        String s=in.nextLine();
        String[] like=love.split(" ");
        String[] ss=s.split("");
        List<String> c=new ArrayList<>();
        for(int i=0;i<m;i++){
            c.add(like[i]);
        }
        int[] p=new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            if(c.contains(ss[i])){
                p[x]=i;
                x++;
            }
        }
        for(int i=0;i<n;i++){
            if(!c.contains(ss[i])){
                int targetposition=p[0];
                for(int e:p){
                    targetposition=Math.min(Math.abs(i-e),targetposition);
                }
                ss[i]=ss[targetposition];

            }
        }
        System.out.println(Arrays.toString(ss));
    }
}
