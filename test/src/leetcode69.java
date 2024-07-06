/**
 * @author 周诚信
 * @date 2024/7/2
 */
public class leetcode69 {
    public static void main(String[] args) {
        int x=2147395599;
        int left=0;int right=x;
        int mid=0,ans=0;
        while (left<=right){
            mid=left+(right-left)/2;
            if((long)mid*mid<=x){
                ans=mid;
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

        System.out.println(ans);

    }
}
