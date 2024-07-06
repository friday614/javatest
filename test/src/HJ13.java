import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/22
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();

        List<String> str=new ArrayList<>();
        String[] word=s.split(" ");
        for(int i= word.length-1;i>=0;i--){
            System.out.format("%s ",word[i]);
        }

    }
}
