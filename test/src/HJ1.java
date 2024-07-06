import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/14
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int index=s.lastIndexOf(' ');
        String lastword=s.substring(index+1);
        System.out.println(lastword.length());
    }
}
