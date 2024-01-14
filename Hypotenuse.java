import java.util.*;
public class Hypo{
    public static void main (String[] args){
        Scanner p = new Scanner(System.in);
        double a = p.nextDouble();
        double b = p.nextDouble();
        double h = Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",h);
        
    }
}