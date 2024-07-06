import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 周诚信
 * @date 2024/3/11
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Set<Integer> num=new HashSet<>();
        for(int i=0;i<n;i++){
            int getin=in.nextInt();
            num.add(getin);

        }
        Integer[] array = num.toArray(new Integer[0]);
        Arrays.sort(array);
        for(int i=0;i< num.size();i++){
            System.out.println(array[i]);
        }
    }
}
