import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/17
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String num=str.substring(2);
        int n=Integer.parseInt(num,16);
        System.out.println(n);
    }
}
