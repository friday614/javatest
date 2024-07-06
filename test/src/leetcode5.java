/**
 * @author 周诚信
 * @date 2024/3/3
 */
//暴力解法
    //最长回文字串
public class leetcode5 {
    public static void main(String[] args) {
        String s = "424";
        int a = 0;
        int l = s.length();
        boolean find = false;
        for(int length = s.length(); !find; length--){
            for(int begin=0;begin<(s.length()-length+1)&&find==false;begin++){
                String b=s.substring(begin,begin+length);
                if(check(b)){
                    find =true;
                    a=begin;
                    l=length;

                }

            }
        }
        System.out.println(s.substring(a,a+l));
    }
    public static boolean check(String s){
        String[] c=s.split("");
        for (int i=0;i<s.length()/2;i++){
            if(!c[i].equals(c[s.length() - i - 1])){
                return false;
            }
        }
        return true;
    }
}
