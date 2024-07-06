import java.util.*;

import static java.util.Arrays.*;

/**
 * @author 周诚信
 * @date 2024/3/23
 */
public class HJ26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] t=str.toCharArray();
        List<Character> s=new ArrayList<>();
        for(int i=0;i<t.length;i++){
            if(Character.isLetter(t[i])){
                s.add(t[i]);
            }
        }

        Collections.sort(s, new Comparator<Character>() {
            @Override
            public int compare(Character t1, Character t2) {
                    int ascii1,ascii2;
                    if(t1>='A'&&t1<='Z'){
                        ascii1=t1+('a'-'A');
                    }
                    else {
                        ascii1=t1;
                    }
                    if(t2>='A'&&t2<='Z'){
                        ascii2=t2+('a'-'A');
                    }
                    else {
                        ascii2=t2;
                    }
                    return ascii1-ascii2;
            }
        });
        StringBuilder targetstr=new StringBuilder();
        int index=0;
        for(int i=0;i<t.length;i++){
            if(Character.isLetter(t[i])){
                targetstr.append(s.get(index));
                index++;
            }
            else {
                targetstr.append(t[i]);
            }
        }
        System.out.println(targetstr.toString());


    }
}
