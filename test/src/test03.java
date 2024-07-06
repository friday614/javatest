/**
 * @author 周诚信
 * @date 2024/4/1
 */
public class test03 {
    public static void main(String[] args) {
        int[] num={1, -2, 4, -5, 7,8, 10, 0, -11};
        int[] x=new int[1];
        x[0]=num[0];
        int max=x[0];
        for(int i=1;i<num.length;i++){
            //x[1]=Math.max(x[0]+num[i],num[i]);
            max=Math.max(max,Math.max(x[0]+num[i],num[i]));
               ;
        }

    }
}
