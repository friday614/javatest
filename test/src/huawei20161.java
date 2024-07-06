import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/13
 */
public class huawei20161 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(in.toString());
        do{
            int N = in.nextInt();
            int M = in.nextInt();
            int[] grade = new int[N];
            for (int i = 0; i < N; i++) {
                grade[i] = in.nextInt();
            }
            for (int l = 0; l < M; l++) {
                char flag = in.next().charAt(0);

                if (flag == 'Q') {
                    int temp1 = in.nextInt() - 1;
                    int temp2 = in.nextInt() - 1;
                    int start = Math.min(temp1, temp2);
                    int end = Math.max(temp1, temp2);
                    int max = grade[start];
                    for (int i = start; i <= end; i++) {
                        max = Math.max(max, grade[i]);
                    }
                    System.out.println(max);
                    continue;

                }
                if (flag == 'U') {
                    int position = in.nextInt() - 1;
                    int mark = in.nextInt();
                    grade[position] = mark;
                }
            }
        }while(in.hasNextInt());
    }
}
