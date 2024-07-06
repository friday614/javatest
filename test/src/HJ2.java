import java.util.*;

/**
 * @author 周诚信
 * @date 2024/3/14
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        char target=in.next().charAt(0);
        char[] str=s.toCharArray();
        List<Character> listofs=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            listofs.add(str[i]);
        }
        if(target>='A'&&target<='z') {
            if (target >= 'A' && target <= 'Z') {
                char target1;
                target1 = (char) (target + ('a' - 'A'));
                int num = Collections.frequency(listofs, target) + Collections.frequency(listofs, target1);
                System.out.println(num);

            }
            if (target >= 'a' && target <= 'z') {
                char target1;
                target1 = (char) (target - ('a' - 'A'));
                int num = Collections.frequency(listofs, target) + Collections.frequency(listofs, target1);
                System.out.println(num);

            }
        }
        else {
            int num=Collections.frequency(listofs,target);
            System.out.println(num);
        }

    }
}
