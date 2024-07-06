import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/11
 */
//三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
//小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
//数据范围：输入的正整数满足
public class huawei1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n!=0){
            int bottle=n;
            int drink=0;
            while(bottle>=3){
                drink=drink+bottle/3;
                bottle=bottle-3*(bottle/3)+bottle/3;
            }
            if(bottle==2){
                drink++;
            }
            System.out.println(drink);
            n=in.nextInt();

        }
    }
}
