import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 周诚信
 * @date 2024/3/21
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Set<Character> c=new HashSet<>();
        for (int i=0;i<str.length();i++){
            c.add(str.charAt(i));
        }
        System.out.println(c.size());
    }
}
