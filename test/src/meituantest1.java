/**
 * @author 周诚信
 * @date 2024/3/8
 */
//平均数为k的最长连续子数组
import java.util.Scanner;
import java.util.Arrays;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class meituantest1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            int n=in.nextInt();//数组长度
            int k=in.nextInt();//平均值
            int[] arrys=new int[n+1];
            arrys[0]=0;
            int maxlength=0;
            int sum=arrys[0];
            for(int i=1;i<=n;i++){
                arrys[i]=in.nextInt();
            }
            int start=0,end=0;
            while(start<=n&&end<=n){
                int length;

                if(start==0){
                    if(end==0) length=1;
                    else length=end;
                }
                else{
                    length=end-start+1;
                }
                if(sum<length*k){
                    end++;
                    if(end>n||start>n){
                        break;
                    }
                    sum=sum+arrys[end];
                    length++;
                }
                if(sum>length*k){
                    if(start==end){
                        start++;
                        end++;
                        if(end>n||start>n){
                            break;
                        }
                        sum=arrys[start];
                    }
                    else {
                        sum = sum - arrys[start];
                        start++;
                        if(end>n||start>n){
                            break;
                        }
                        length--;
                    }
                }
                if(sum==length*k){
                    maxlength=Math.max(maxlength,length);
                    end++;
                    if(end>n||start>n){
                        break;
                    }
                    sum=sum+arrys[end];
                    length++;
                }

            }
            if(maxlength==0){
                System.out.println(-1);
            }
            else{
                System.out.println(maxlength);
            }


        }
}
