import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/11
 */
public class huawei3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String test=in.nextLine().substring(2);

        int x=Integer.parseInt(test,16);
        System.out.println(x);
    }
}
