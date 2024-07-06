import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/24
 */
public class HJ29  {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2= in.nextLine();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<str1.length();i++){
                if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {//大写字母
                    if(str1.charAt(i)=='Z'){
                        s1.append('a');
                    }
                    else {
                        char temp= (char) (str1.charAt(i)+('a'-'A')+1);
                        s1.append(temp);
                    }

                }
                else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z'){
                    if(str1.charAt(i)=='z'){
                        s1.append('A');
                    }
                    else {
                        char temp= (char) (str1.charAt(i)-('a'-'A')+1);
                        s1.append(temp);
                    }

                }
                else if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                    if(str1.charAt(i)=='9'){
                        s1.append('0');
                    }
                    else {
                        char temp= (char) (str1.charAt(i)+1);
                        s1.append(temp);
                    }

                }
                else {
                    s1.append(str1.charAt(i));
                }
            }
        System.out.println(s1.toString());
        for(int i=0;i<str2.length();i++){
            if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') {//大写字母
                if(str2.charAt(i)=='A'){
                    s2.append('z');
                }
                else {
                    char temp= (char) (str2.charAt(i)+('a'-'A')-1);
                    s2.append(temp);
                }

            }
            else if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z'){
                if(str2.charAt(i)=='a'){
                    s2.append('Z');
                }
                else {
                    char temp= (char) (str2.charAt(i)-('a'-'A')-1);
                    s2.append(temp);
                }

            }
            else if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                if(str2.charAt(i)=='0'){
                    s2.append('9');
                }
                else {
                    char temp= (char) (str2.charAt(i)-1);
                    s2.append(temp);
                }

            }
            else {
                s2.append(str2.charAt(i));
            }
        }
        System.out.println(s2.toString());

    }

}
