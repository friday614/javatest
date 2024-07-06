import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class HJ59 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                s.append(str.charAt(i));
                break;
            }
        }
        if(s.isEmpty()){
            System.out.println("-1");
        }
        else {
            System.out.println(s);
        }
    }
}
