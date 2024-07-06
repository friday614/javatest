import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/17
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder num= new StringBuilder(in.next()).reverse();
        List<Character> n=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            if(!n.contains(num.charAt(i))){
                n.add(num.charAt(i));
            }
        }
        for (Character character : n) {
            System.out.format("%c", character);
        }
    }
}
