import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = p.nextInt();
        float c = p.nextFloat();
        double s = (a+b+c)/2;
        Double t = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",t);
    }
}