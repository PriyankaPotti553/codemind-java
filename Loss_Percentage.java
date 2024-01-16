import java.util.*;
public class Loss{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int cp = a.nextInt();
        int sp = a.nextInt();
        float l = cp - sp;
        float lp = (l*100)/cp;
        System.out.printf("%.2f",lp);
        
    }
}