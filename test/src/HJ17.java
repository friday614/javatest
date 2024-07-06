import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/22
 */
public class HJ17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] word=str.split(";");
        //System.out.println(Arrays.toString(word));
        int[] position={0,0};
        for(int i=0;i< word.length;i++){
            move(position,word[i]);
        }
        System.out.println(Arrays.toString(position));


    }
    public static boolean move(int[] position,String move){
        if(move.length()==0){
            return false;
        }
        char direction=move.charAt(0);
        String len=move.substring(1);
        if(direction!='A'&&direction!='S'&&direction!='D'&&direction!='W'){
            return false;
        }
        try {
            int length=Integer.parseInt(len);
        }catch (NumberFormatException e){
            return false;
        }
        int length=Integer.parseInt(len);
        if(direction=='A'){
            position[0]=position[0]-length;
        }
        if(direction=='S'){
            position[1]=position[1]-length;
        }
        if(direction=='D'){
            position[0]=position[0]+length;
        }
        if(direction=='W'){
            position[1]=position[1]+length;
        }
        return true;

    }

}
