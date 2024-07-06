/**
 * @author 周诚信
 * @date 2024/7/2
 */
public class leetcode367 {
    public static void main(String[] args) {
        int num=16;
        int left=0;
        int right=num;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if((long)mid*mid==num){
                System.out.println(true);
                return;
            }
            if((long)mid*mid>num){
                right=mid-1;
            }
            if((long)mid*mid<num){
                left=mid+1;
            }
        }
        System.out.println(false);
        return;
        
    }
}
