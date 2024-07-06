import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/30
 */
public class JD3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
            int part = n / 2;
            Long sum = (long) (Math.pow(26, part) * 25 * part);
            long end = sum % 998244353;
            System.out.println(end);

    }
}
