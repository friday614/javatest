/**
 * @author 周诚信
 * @date 2024/2/28
 */
import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要打印的行数：");
        int n = input.nextInt();
        printYangHuiTriangle(n);
    }

    public static void printYangHuiTriangle(int n) {
        int[][] triangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            // 每行的第一个和最后一个数字都是1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                // 其他数字是上一行的两个数字之和
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // 打印杨辉三角
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

