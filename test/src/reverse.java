
public class reverse {
    public static void main(String[] args) {
        int x = 123;
        int y = -123;
        System.out.println(reverse(x));
        System.out.println(reverse(y));
    }

    public static int reverse(int x) {
        int rev=0;// 初始
        while(x!=0) {
            int pop = x % 10;//尾数
            x/=10;//x去除尾数
            if(rev>Integer.MAX_VALUE/10||
                    (rev==(Integer.MAX_VALUE/10)&&pop>(Integer.MAX_VALUE%10))){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10||
                    (rev==(Integer.MIN_VALUE/10)&&pop<(Integer.MIN_VALUE%10))){
                return 0;
            }
            rev=rev*10+pop;
            }
        return rev;
    }
}
