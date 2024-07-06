import java.util.HashMap;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class LeetCode13 {
    public static void main(String[] args) {
        String s="MCMXCIV";
        HashMap<Character,Integer> trans=new HashMap<>();
        trans.put('I',1);
        trans.put('V',5);
        trans.put('X',10);
        trans.put('L',50);
        trans.put('C',100);
        trans.put('D',500);
        trans.put('M',1000);
        int sum=0;
        for (int i=0;i<s.length();i++){
            if(i+2<=s.length()) {
                if (s.substring(i, i + 2).equals("IV")) {
                    sum = sum + 4;
                    i++;
                    continue;
                }
                if (s.substring(i, i + 2).equals("IX")) {
                    sum = sum + 9;
                    i++;
                    continue;
                }
                if (s.substring(i, i + 2).equals("XL")) {
                    sum = sum + 40;
                    i++;
                    continue;
                }
                if (s.substring(i, i + 2).equals("XC")) {
                    sum = sum + 90;
                    i++;
                    continue;
                }
                if (s.substring(i, i + 2).equals("CD")) {
                    sum = sum + 400;
                    i++;
                    continue;
                }
                if (s.substring(i, i + 2).equals("CM")) {
                    sum = sum + 900;
                    i++;
                    continue;
                }
            }
            sum=sum+trans.get(s.charAt(i));

        }
        System.out.println(sum);

    }
}
