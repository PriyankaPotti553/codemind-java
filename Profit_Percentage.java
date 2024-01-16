import java.util.*;
public class Profit{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cp = s.nextInt();
        int sp = s.nextInt();
        float p = sp - cp;
        float pp = (p*100)/cp;
        System.out.printf("%.2f",pp);
    }
}