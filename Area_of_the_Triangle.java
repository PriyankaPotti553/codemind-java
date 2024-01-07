import java.util.*;
public class Triangle{
    public static void main(String[] arg){
        Scanner m = new Scanner(System.in);
        int a = m.nextInt();
        int b = m.nextInt();
        float c = m.nextFloat();
        double s = (a+b+c)/2;
        double ta = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ta);
    }
}