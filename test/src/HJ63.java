import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class HJ63 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String DNA = in.nextLine();
        int n = in.nextInt();
        int slow = 0;
        int fast = n;
        String temp=DNA.substring(0,n);
        temp=temp.replaceAll("G","");
        temp=temp.replaceAll("C","");

        int sum=n-temp.length();
        int max=sum;
        int starposition=0;
        while (fast<DNA.length()){
            if(DNA.charAt(slow)=='G'||DNA.charAt(slow)=='C'){
                if(DNA.charAt(fast)=='G'||DNA.charAt(fast)=='C'){

                }
                else {
                    sum--;
                }

            }
            else {
                if(DNA.charAt(fast)=='G'||DNA.charAt(fast)=='C'){
                    sum++;
                }
                else {

                }

            }
            slow++;
            fast++;
            if(sum>max){
                max=sum;
                starposition=slow;


            }

        }
        String GC=DNA.substring(starposition,starposition+n);
        System.out.println(GC);
    }
}
