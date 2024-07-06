import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/17
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float num=in.nextFloat();
        float small=num%1;
        if(small>=0.5){
            num=num-small+1;
        }
        if(small<0.5){
            num=num-small;
        }
        int ans=(int) num;
        System.out.println(ans);
    }
}
