import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/3/5
 */
//同构字符串
public class leetcode205 {
    public static void main(String[] args) {
        String a="paper";
        String b="title";
        int[] ascii=new int[128];
        Arrays.fill(ascii,-1);
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        boolean flag=true;
        if(a1.length!= b1.length){
            flag=false;
        }
        else {
            for (int i = 0; i < a1.length; i++) {
                int x = a1[i];
                int y = b1[i];
                if (ascii[x] == -1) {
                    ascii[x] = y;
                }
                if (ascii[x] != y) {
                    flag = false;
                    break;
                }
            }
            Arrays.fill(ascii,-1);
            for (int i = 0; i < b1.length; i++) {
                int x = a1[i];
                int y = b1[i];
                if (ascii[y] == -1) {
                    ascii[y] = x;
                }
                if (ascii[y] != x) {
                    flag = false;
                    break;
                }
            }

        }
        System.out.println(flag);

    }
}
